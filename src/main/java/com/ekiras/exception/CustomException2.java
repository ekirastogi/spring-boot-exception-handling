package com.ekiras.exception;

import com.ekiras.util.messages.error.ErrorCodes;

/**
 * @author ekansh
 * @since 19/2/16
 */
public class CustomException2 extends BaseException {

    public CustomException2() {
        super(ErrorCodes.CUSTOM_EXCEPTION_2);
    }
}
