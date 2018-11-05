package edu.wmich.CS1120.lab5;

public class NameFormatException extends Exception{

	public NameFormatException() {}

    public NameFormatException(String message) {
        super (message);
    }

    public NameFormatException(Throwable cause) {
        super (cause);
    }

    public NameFormatException(String message, Throwable cause) {
        super (message, cause);
    }
}
