package edu.wmich.CS1120.lab5;

import java.io.FileNotFoundException;

public interface IFormatExceptionHandler {
	
	void handleFileNotFoundException(FileNotFoundException e);
	/*Handle file not found exception*/
	
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);
	/*Handle phone number format exception*/
	
	void handleEmailFormatException(EmailAddressFormatException e);
	/*Handle email format exception*/
	
	void handleNameFormatException(NameFormatException e);
	/*Handle name format exception*/

}
