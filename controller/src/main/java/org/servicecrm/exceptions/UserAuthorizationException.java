package org.servicecrm.exceptions;


public class UserAuthorizationException extends Exception{

    public UserAuthorizationException() {
        super();
    }

    public UserAuthorizationException(String message) {
        super(message);
    }

}
