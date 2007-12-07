/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.ui.shared.iface;

public interface ITraceLog
{
  /**
   * Trace level <code>CRITICAL</code>.
   */
  public static final int CRITICAL    =   1;

  /**
   * Trace level <code>ERROR</code>.
   */
  public static final int ERROR       =   2;

  /**
   * Trace level <code>INFO</code>.
   */
  public static final int INFO        =   4;

  /**
   * Trace level <code>DEBUG</code>.
   */
  public static final int DEBUG       =   8;

  /**
   * Trace level <code>TRACE</code>.
   */
  public static final int TRACE       =  16;

  /**
   * Trace level <code>EXCEPTION</code>.
   */
  public static final int EXCEPTION   =  32;

  /**
   * Trace level <code>QUIET</code>.
   */
  public static final int QUIET       =   0;

  /**
   * Trace level <code>ALL</code>.
   */
  public static final int VERBOSE     = 63;

  /**
   * <code>DEFAULT_LOGLEVEL</code>. Identifies to log all by default.
   */
  public static final int DEFAULT_LOGLEVEL = VERBOSE;

  /**
   * <code>DEFAULT_LOGPATH</code>. Identifies the default path to log to.
   */
  public static final String DEFAULT_LOGPATH = "Trace.log";
}
