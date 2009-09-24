/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */

package org.teiid.adminapi;

import java.util.Set;

import com.metamatrix.core.log.MessageLevel;


/** 
 * The LogConfiguration describes the current configuration of the
 * system logger.
 * 
 * <p>The log configuration is used to filter on log contexts (components) 
 * and log levels (severity).</p>
 * 
 * @since 4.3
 */
public interface LogConfiguration extends AdminObject {
    
    /**
     * Message level value that specifies that no messages are to be recorded.
     */
    public static final int NONE = MessageLevel.NONE;

    /**
     * Message level value that specifies that critical messages are to be recorded.
     */
    public static final int CRITICAL = MessageLevel.CRITICAL;

    /**
     * Message level value that specifies that error messages and critical
     * messages are to be recorded.
     */
    public static final int ERROR = MessageLevel.ERROR;

    /**
     * Message level value that specifies that warning, error and critical
     * messages are to be recorded.
     */
    public static final int WARNING = MessageLevel.WARNING;

    /**
     * Message level value that specifies that information, warning, error and critical
     * messages are to be recorded.
     */
    public static final int INFO = MessageLevel.INFO;

    /**
     * Message level value that specifies that detailed, information, warning, error and critical
     * messages are to be recorded.
     */
    public static final int DETAIL = MessageLevel.DETAIL;

    /**
     * Message level value that specifies that all messages are to be recorded.
     */
    public static final int TRACE = MessageLevel.TRACE;
    
    
    /**
     * Get the current configured Log Level for supplied context
     * @param context
     * @return int value 
     * @see com.metamatrix.core.log.MessageLevel
     * @since 4.3
     */
    int getLogLevel(String context);
    
    /**
     * Obtain the set of message contexts that are currently used.
     * @return the unmodifiable set of context Strings; never null
     */
    Set<String> getContexts(); 
    
    /** 
     * Set the Log Level
     * 
     *  Note:  Must call setLogConfiguration(LogConfiguration) for log level to take
     *  affect on the server. 
     * 
     * @param context log context name
     * @param logLevel The logLevel to set.
     */
    public void setLogLevel(String context, int logLevel);
}
