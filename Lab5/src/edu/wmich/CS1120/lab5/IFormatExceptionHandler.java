package edu.wmich.CS1120.lab5;

import java.io.FileNotFoundException;

public interface IFormatExceptionHandler {
	void handleFileNotFoundException(FileNotFoundException e);
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);
	void handleEmailFormatException(EmailAddressFormatException e);
	void handleNameFormatException(NameFormatException e);

}
