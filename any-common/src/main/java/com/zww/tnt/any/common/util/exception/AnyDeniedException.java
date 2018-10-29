package com.zww.tnt.any.common.util.exception;

/**
 * 403 授权拒绝
 */
public class AnyDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AnyDeniedException() {
    }

    public AnyDeniedException(String message) {
        super(message);
    }

    public AnyDeniedException(Throwable cause) {
        super(cause);
    }

    public AnyDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnyDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
