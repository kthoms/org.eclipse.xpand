/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.profiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtend.profiler.profilermodel.CallGroup;
import org.eclipse.xtend.profiler.profilermodel.Item;
import org.eclipse.xtend.profiler.profilermodel.ModelFactory;
import org.eclipse.xtend.profiler.profilermodel.ProfilingResult;


/**
 * Records method calls and the resulting call stack to build up a profiling result.
 * Please understand that the given implementation is not aware of threads but uses
 * a simple idea of a linearity. Also, the implementation uses a TimeProvider that
 * per default relies on the system time. This might lead into problems when hibernating
 * the execution environment or debugging the runtime system.
 *   
 * The output is will not be scanned for cycles. Use a CycleDetector as a post-processing
 * step for this
 * 
 * @see org.eclipse.xtend.profiler.CycleDetector
 * @author Heiko Behrens - Initial contribution and API
 * 
 * TODO: Make this class acting as a facade that can handle cycles by itself and offers
 * result only after the internal state has been fixed to prevent further modifications.
 *
 */
public class Profiler {
	public interface TimeProvider {
		long getNanoSeconds();
	}
	
	private TimeProvider timeProvider = new TimeProvider() {
		public long getNanoSeconds() {
			return System.nanoTime();
		}
	};
	
	public TimeProvider getTimeProvider() {
		return timeProvider;
	}

	public void setTimeProvider(TimeProvider timeProvider) {
		this.timeProvider = timeProvider;
	}

	class Call {
		final Item item;
		CallGroup callGroup;
		long startedAt;
		
		Call(Item item) {
			this.item = item;
		}
		
		void startCounting(CallGroup callGroup) {
			this.startedAt = timeProvider.getNanoSeconds();
			this.callGroup = callGroup;
		}
		
		void freeze(boolean measureTimeForItem) {
			long neededTime = timeProvider.getNanoSeconds() - startedAt;
			if(item != null && measureTimeForItem)
				item.setItemTime(item.getItemTime() +neededTime);
			if(callGroup != null)
				callGroup.setTime(callGroup.getTime() +neededTime);
		}

		public boolean isSameName(String name) {
			return item != null && name.equals(item.getName());
		}
	}
	
	private final ProfilingResult profilingResult;
	
	public ProfilingResult getProfilingResult() {
		return profilingResult;
	}

	List<Call> stack = new ArrayList<Call>();
	Map<String, Item> items = new HashMap<String, Item>();
	
	public Profiler() {
		this(ModelFactory.eINSTANCE.createProfilingResult());
	}
	
	public Profiler(ProfilingResult profilingResult) {
		this.profilingResult = profilingResult;
	}

	private Item createItem(String key) {
		Item result = ModelFactory.eINSTANCE.createItem();
		result.setItemName(key);
		items.put(key, result);
		profilingResult.getItems().add(result);
		return result;
	}
	
	public Item getItem(String key) {
		Item result = items.get(key);
		if (result == null)
			result = createItem(key);
		return result;
	}
	
	public void beginRoutine(String key) {
		if(key==null)
			beginRoutine();
		else
			beginRoutine(getItem(key));
	}
	
	private CallGroup getCallGroup(Item caller, Item subroutine) {
		for (CallGroup calls : caller.getSubroutines()) {
			if(calls.getSubroutine().equals(subroutine))
				return calls;
		}
		CallGroup result = ModelFactory.eINSTANCE.createCallGroup();
		caller.getSubroutines().add(result);
		result.setSubroutine(subroutine);
		return result;
	}
	
	private void beginRoutine(Item routine) {
		Call call = new Call(routine);
		CallGroup group = findCallGroup(routine);
			
		stack.add(0, call);
		call.startCounting(group);
	}

	private CallGroup findCallGroup(Item routine) {
		Item invoker = findLastInvoker();
		CallGroup group = null;
		if(invoker != null) {
			group = getCallGroup(invoker, routine);
			group.setCount(group.getCount() + 1);
		}
		return group;
	}

	private void beginRoutine() {
		stack.add(0, new Call(null));
	}
	
	private Item findLastInvoker() {
		for (Call call : stack) {
			if(call.item != null)
				return call.item;
		}
		return null;
	}
	
	public void endRoutine() {
		Call lastCall = stack.remove(0);
		lastCall.freeze(true);
	}

	public boolean hasFinished() {
		return stack.isEmpty();
	}
	
}
