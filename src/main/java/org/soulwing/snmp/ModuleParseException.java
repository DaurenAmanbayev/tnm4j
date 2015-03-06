/*
 * File created on Sep 11, 2013 
 *
 * Copyright 2008-2011 Carl Harris, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.soulwing.snmp;

/**
 * An exception thrown when a specified MIB module cannot be located by
 * the underlying provider.
 *
 * @author Carl Harris
 */
public class ModuleParseException extends MIBException {

  private static final long serialVersionUID = -584299686841096907L;
  
  /**
   * Constructs a new instance.
   * @param message
   * @param cause
   */
  public ModuleParseException(String message, Throwable cause) {
    super(message, cause);
  }

}