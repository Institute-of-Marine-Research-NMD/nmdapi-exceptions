package no.imr.nmdapi.exceptions;

/**
 * General exception extended by all other S2D exceptions.
 *
 * @author kjetilf
 */
public class S2DException extends RuntimeException {

    /**
     * New exception without cause.
     *
     * @param message  Message.
     */
    public S2DException(final String message) {
        super(message);
    }

    /**
     * New exception with cause.
     *
     * @param message   Message.
     * @param cause     Cause.
     */
    public S2DException(final String message, final Exception cause) {
        super(message, cause);
    }
}
