package edu.realemj.exercises13;

public class InvalidRadiusException extends Exception {
    public InvalidRadiusException() {}

    public InvalidRadiusException(String message) {
        super(message);
    }

    public InvalidRadiusException(String message, Exception e) {
        super(message, e);
    }
}
