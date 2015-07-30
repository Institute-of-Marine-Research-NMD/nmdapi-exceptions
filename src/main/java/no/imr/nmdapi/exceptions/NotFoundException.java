
package no.imr.nmdapi.exceptions;

/**
 * Thrown if element cannot be found.
 *
 * @author kjetilf
 */
public class NotFoundException extends S2DException {

    /**
     * New exception with message and cause.
     *
     * @param message   Message.
     * @param cause     Cause.
     */
    public NotFoundException(final String message, final Exception cause) {
        super(message, cause);
    }

    /**
     * New exception with message.
     *
     * @param message    Message.
     */
    public NotFoundException(final String message) {
        super(message);
    }

}
