package com.group_4_trial_1.Nutri_App_user_Trial.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class UserApiException {

    private final String message;
//    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

    public UserApiException(String message,  HttpStatus httpStatus, ZonedDateTime timeStamp) {
        this.message = message;
//        this.throwable = throwable;
        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

//    public Throwable getThrowable() {
//        return throwable;
//    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }
}
