package edu.wmich.CS1120.lab5;

public class PhoneNumberFormatException extends Exception {
	
	public PhoneNumberFormatException() {}

    public PhoneNumberFormatException(String message) {
        super (message);
    }

    public PhoneNumberFormatException(Throwable cause) {
        super (cause);
    }

    public PhoneNumberFormatException(String message, Throwable cause) {
        super (message, cause);
    }
}
