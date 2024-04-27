package Contact;

import java.util.ArrayList;

public class ContactService {
	
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void displayContactList() {
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getfirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getlastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
		}
	}
public void addContact(String firstName, String lastName, String number, String address) {
	Contact contact = new Contact(firstName, lastName, number, address);
	contactList.add(contact);
}
public Contact getContact(String contactID) {
	Contact contact = new Contact (null, null, null, null);
	for(int counter = 0; counter < contactList.size(); counter++) {
		if(contactList.get(counter).getContactID().contentEquals(contactID))
	contact = contactList.get(counter);
		}
	}
return contract;


public void deleteContact(String contactID) {
	for(int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).getContactID().equals(contactID)) {
			contactList.remove(counter);
				break;
		}
		if (counter == contactList.size() -1) {
			System.out.println("Contact ID; " + contactID + " not found.");
		}
	}
}

public void updateFirstName(String updateString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if(contactList.get(counter).getContactID().equals(contactID)) {
			
			break;
		}
		if (counter == contactList.size() -1) {
			System.out.println("Contact ID: " + contactID + "not found.");
		}
	}
}
public void updateLastName(String updateString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if(contactList.get(counter).getContactID().equals(contactID)) {
			break;
		}
		if (counter == contactList.size() -1) {
			System.out.println("Contact ID: " + contactID + "not found.");
		}
	}
}
public Void updateNumber(String updateString, String contactID) {
	for( int counter =0; counter < contactList.size(); counter++) {
		if(contactList.get(counter).getContactID().equals(contactID)) {
			break;
		}
		if(counter == contactList.size() -1 ) {
			System.out.println("Contact ID; " + contactID + " not found.");
		}
	}
}
public void updateAddress(String updateString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).getContactID().equals(contactID))

		break;
	}
	if(counter == contactList.size() -1 ) {
		System.out.println("Contact ID: " + contactID + " not found");
			
		}

}
}
