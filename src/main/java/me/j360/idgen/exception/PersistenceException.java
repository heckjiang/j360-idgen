/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.j360.idgen.exception;

/**
 * This is an exception class for persistence
 * 
 * @author Jongpil Park
 * 
 * @since 1.5.0
 */
public class PersistenceException extends BaseRuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public PersistenceException(String message) {
		super(message);
	}

	/**
	 * Constructor with a message and an exception.
	 * 
	 * @param message
	 *            the message of this exception
	 * @param exception
	 *            the exception that is wrapped in this exception
	 */
	public PersistenceException(String message, Throwable exception) {
		super(message, exception);
	}
}
