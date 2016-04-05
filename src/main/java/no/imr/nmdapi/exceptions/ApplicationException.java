
package no.imr.nmdapi.exceptions;

/**
 * Application thrown if the application fails due to programming error.
 *
 * @author kjetilf
 */
public class ApplicationException extends RuntimeException {

    /**
     * Initalize.
     *
     * @param message   Error message.
     * @param cause     Cause of the exception.
     */
    public ApplicationException(String message, Exception cause) {
        super(message, cause);
    }

}
