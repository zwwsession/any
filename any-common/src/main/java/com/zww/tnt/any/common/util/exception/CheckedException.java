package com.zww.tnt.any.common.util.exception;

/**
 * @author zww
 * @date 😴2018年05月21日20:44:38
 */
public class CheckedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CheckedException() {
    }

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(Throwable cause) {
        super(cause);
    }

    public CheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
