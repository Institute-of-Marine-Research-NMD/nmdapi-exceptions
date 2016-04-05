
package no.imr.nmdapi.exceptions;

/**
 * Application thrown if the data is wrong.
 *
 * @author kjetilf
 */
public class BadRequestException extends RuntimeException {

    /**
     * Initalize.
     *
     * @param message   Error message.
     * @param cause     Cause of the exception.
     */
    public BadRequestException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Initalize.
     *
     * @param message   Error message.
     */
    public BadRequestException(String message) {
        super(message);
    }

}
