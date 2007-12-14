/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2t.common.recipe.ui;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;

import org.eclipse.m2t.common.recipe.ui.shared.iface.ITraceLog;

public class TraceLog implements ITraceLog {
	private static PrintWriter pwLog = null;
	private static int cvLogLevel;
	private static String cvLogPath;
	/**
	 * returns the current time format: YYYY-MM-DD hh:mm:ss.fff (String)
	 */
	private final static String getTime() {
		// Variablen
		String time;
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		time = ts.toString();
		// ggf. 1/100 Sekunden auffuellen
		if (time.length() == 21) {
			time += "0";
		}
		// ggf. 1/1000 Sekunden auffuellen
		if (time.length() == 22) {
			time += "0";
		}
		return time;
	}
	/**
	 * initializes log
	 */
	private static void initLog() {
		if (cvLogPath == null)
			cvLogPath = DEFAULT_LOGPATH;
		try {
			pwLog = new PrintWriter(new FileOutputStream(cvLogPath, true));
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
	/**
	 * Writes a log
	 */
	private final static void writeLog(String aLog) {
		initLog();
		if (pwLog != null) {
			try {
				pwLog.write(aLog);
				pwLog.flush();
				pwLog.close();
				pwLog = null;
			} catch (Exception e) {
				System.err
						.println("TraceLog.log(): Fehler: could not write to log file "
								+ aLog);
				e.printStackTrace(System.err);
			}
		} else {
			System.err.println("TraceLog.log(): Fehler: Log nicht gestartet"
					+ aLog);
		}
	}
	/**
	 * Writes a log with a given level
	 */
	public final static void log(int aLevel, String aMessage) {
		if ((aLevel > (CRITICAL | ERROR | INFO | DEBUG | TRACE | EXCEPTION))
				|| (aLevel < 1)) {
			log(new Exception("TraceLog.log(): Error: invalid Level " + aLevel));
		} else {
			if ((cvLogLevel & aLevel) != QUIET) {
				StringBuffer log = new StringBuffer();
				String seperator = "-";
				// Zeitangabe
				log.append(getTime());
				log.append(' ');
				// loglevel CRITICAL
				if ((aLevel & CRITICAL) != 0) {
					log.append("CRI");
				} else {
					log.append(seperator);
				}
				// loglevel ERROR
				if ((aLevel & ERROR) != 0) {
					log.append("ERR");
				} else {
					log.append(seperator);
				}
				// loglevel INFO
				if ((aLevel & INFO) != 0) {
					log.append("INF");
				} else {
					log.append(seperator);
				}
				// loglevel DEBUG
				if ((aLevel & DEBUG) != 0) {
					log.append("DEB");
				} else {
					log.append(seperator);
				}
				// loglevel TRACE
				if ((aLevel & TRACE) != 0) {
					log.append("TRC");
				} else {
					log.append(seperator);
				}
				// loglevel EXCEPTION
				if ((aLevel & EXCEPTION) != 0) {
					log.append("EXC");
				} else {
					log.append(seperator);
				}
				log.append(" ");
				// Message
				log.append(aMessage);
				log.append("\n");
				writeLog(log.toString());
			}
		}
	}
	/**
	 * Writes a log with a implicite level "EXCEPTION"
	 */
	public final static void log(Exception anException) {
		StringWriter s = new StringWriter();
		anException.printStackTrace(new PrintWriter(s));
		log(TraceLog.EXCEPTION, s.toString());
	}
	/**
	 * Starts a new logging session with a given log level and a given log file
	 */
	public final static boolean startLogging(int aLevel, String aPath) {
		boolean result = true;
		cvLogLevel = aLevel;
		cvLogPath = aPath;
		if (aPath != null) {
			try {
				// Versuch eine bestehende Datei zu oeffnen
				pwLog = new PrintWriter(new FileOutputStream(aPath, true));
			} catch (IOException e) {
				e.printStackTrace(System.err);
				result = false;
			}
			log(INFO, "Session started");
		} else {
			pwLog = new PrintWriter(System.out);
		}
		return result;
	}
}