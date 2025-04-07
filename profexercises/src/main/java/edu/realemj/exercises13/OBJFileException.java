package edu.realemj.exercises13;

public class OBJFileException extends Exception {
    public OBJFileException() {
        super();
    }

    public OBJFileException(String message) {
        super(message);
    }

    public OBJFileException(String message, Exception e) {
        super(message, e);
    }
}
