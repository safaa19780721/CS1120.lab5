package edu.wmich.CS1120.lab5;

public class EmailAddressFormatException extends Exception {

	public EmailAddressFormatException() {}

    public EmailAddressFormatException(String message) {
        super (message);
    }

    public EmailAddressFormatException(Throwable cause) {
        super (cause);
    }

    public EmailAddressFormatException(String message, Throwable cause) {
        super (message, cause);
    }
}
