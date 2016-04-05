package no.imr.nmdapi.exceptions;

/**
 * This exception is only thrown inside message converters to
 * identify that a conversion could not be successfully completed.
 *
 * @author kjetilf
 */
public class ConversionException extends S2DException {

    /**
     * Initalize.
     *
     * @param message   Message.
     * @param cause Cause.
     */
    public ConversionException(String message, Exception cause) {
        super(message, cause);
    }

}
