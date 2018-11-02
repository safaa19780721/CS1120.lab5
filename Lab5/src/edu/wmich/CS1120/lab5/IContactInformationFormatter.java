package edu.wmich.CS1120.lab5;

public interface IContactInformationFormatter {
	void readContactInformation(String[] filePaths);
	void formatContactInformation(String fileName);
	void formatEmail(String email) throws EmailAddressFormatException;
	void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException;

}
