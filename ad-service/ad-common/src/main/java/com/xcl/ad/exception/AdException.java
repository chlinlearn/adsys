package com.xcl.ad.exception;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/13:25
 * @Description: null
 * @Version: 1.0
 */

public class AdException extends Exception {
    public AdException() {
        super();
    }

    public AdException(String message) {
        super(message);
    }

    public AdException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdException(Throwable cause) {
        super(cause);
    }
}
