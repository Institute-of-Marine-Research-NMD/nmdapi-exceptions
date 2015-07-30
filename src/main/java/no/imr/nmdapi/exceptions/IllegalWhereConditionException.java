package no.imr.nmdapi.exceptions;

/**
 * Thrown when where condition given to the application is illegal. This
 * only applies for parameters that we cannot validate before request is
 * received through the controller.
 *
 * @author kjetilf
 */
public class IllegalWhereConditionException extends S2DException {

    /**
     * Inialize.
     *
     * @param message   Message.
     * @param cause     Cause.
     */
    public IllegalWhereConditionException(String message, Exception cause) {
        super(message, cause);
    }

}
