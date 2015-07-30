package no.imr.nmdapi.exceptions;

/**
 * Files could not be merged.
 *
 * @author kjetilf
 */
public class ConflictException extends S2DException {

    /**
     * Initalize.
     *
     * @param message  Message.
     */
    public ConflictException(String message) {
        super(message);
    }

}
