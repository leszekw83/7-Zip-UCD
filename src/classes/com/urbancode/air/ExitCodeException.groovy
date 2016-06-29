/**
 * � Copyright IBM Corporation 2014.  
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights:  Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp. 
 */

package com.urbancode.air

class ExitCodeException extends Exception {
    /**
    * Construct a new ExitCodeException.
    */
   public ExitCodeException() {
       super();
   }

   /**
    * Construct a new ExitCodeException with the provided message.
    *
    * @param message A brief description of this exception.
    */
   public ExitCodeException(String message) {
       super(message);
   }

   /**
    * Construct a new ExitCodeException instance with the provided cause.
    *
    * @param cause The underlying cause of this exception.
    */
   public ExitCodeException(Throwable cause) {
       super(cause);
   }

   /**
    * Construct a new ExitCodeException instance with the provided message and cause.
    *
    * @param message A brief description of the exception.
    * @param cause The underlying exception which caused this exception to be emitted.
    */
   public ExitCodeException(String message, Throwable cause) {
       super(message, cause);
   }
}
