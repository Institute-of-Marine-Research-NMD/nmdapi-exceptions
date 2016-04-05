/*
 *Thrown when data is missing
*/
package no.imr.nmdapi.exceptions;

/**
 *
 * @author Terry Hannant <a5119>
 */
public class MissingDataException extends S2DException {
    
    
    /**
     * New exception with message and cause.
     *
     * @param message   Message.
     * @param cause     Cause.
     */
    public MissingDataException(final String message, final Exception cause) {
        super(message, cause);
    }

    /**
     * New exception with message.
     *
     * @param message    Message.
     */
    public MissingDataException(final String message) {
        super(message);
    }

    
    
    
}
