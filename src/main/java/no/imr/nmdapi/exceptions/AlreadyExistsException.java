/*
 *Thrown when data exists when it should not.
* For example on creation
*/
package no.imr.nmdapi.exceptions;
/**
 *
 * @author Terry Hannant <a5119>
 */
public class AlreadyExistsException extends S2DException {


    /**
     * New exception with message and cause.
     *
     * @param message   Message.
     * @param cause     Cause.
     */
    public AlreadyExistsException(final String message, final Exception cause) {
        super(message, cause);
    }

    /**
     * New exception with message.
     *
     * @param message    Message.
     */
    public AlreadyExistsException(final String message) {
        super(message);
    }

}
