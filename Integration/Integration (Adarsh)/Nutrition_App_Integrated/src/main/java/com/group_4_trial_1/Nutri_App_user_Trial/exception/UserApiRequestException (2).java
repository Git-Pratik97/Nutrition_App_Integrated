package com.group_4_trial_1.Nutri_App_user_Trial.exception;

public class UserApiRequestException extends RuntimeException{
    public UserApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserApiRequestException(String message) {
        super(message);
    }
}
