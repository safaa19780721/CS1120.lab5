package edu.wmich.CS1120.lab5;

import java.io.FileNotFoundException;

public abstract class FormatExceptionHandler implements IFormatExceptionHandler{

	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleNameFormatException(NameFormatException e) {
		// TODO Auto-generated method stub
		
	}

}
