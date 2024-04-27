package Test;

import Contact.Contact;

public class ContactTest {

	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDwithorethantenchar() {
		Contact contact = new Contact("firstName", "lastName", "Number", "Adress");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.")
		}
}
	
	@Test
	@DisplayName("First Name cannot have more than 10 characters")
	void testFirstNamewithorethantenchar() {
		Contact contact = new Contact("Thisistolong", "lastName", "Number", "Adress");
		if (contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.")	
		}
}
	@Test
	@DisplayName("Last Name cannot have more than 10 characters")
	void testLastNamewithorethantenchar() {
		Contact contact = new Contact("FirstName", "Thisistolong", "PhoneNumber", "Adress");
		if (contact.getLastName().length() > 10) {
			fail("Last Name has more than 10 characters.")
		}
	}
	@Test
	@DisplayName("Contact Phone Number cannot have more than 10 characters")
	void testPhoneNumberwithorethantenchar() {
		Contact contact = new Contact("firstName", "lastName", "0000000000", "Adress");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.")
		}
	}
	@Test
	@DisplayName("Adress cannot have more than 30 characters")
	void testAdresswithorethantenchar() {
		Contact contact = new Contact("firstName", "lastName", "Number", "111222333444 "
				+ "This example is also to long");
		if (contact.getContactID().length() > 30) {
			fail("Contact ID has more than 30 characters.")
		}
	}
	
	@Test
	@DisplayName("Contact First Name shall not be null")
	void testFirstNamenotNull() {
		Contact contact = new Contact("null", "lastName", "PhoneNumber", "Address");
		assertNotNull(contact.getfirstName(), "First name was null.");
	}
	@Test
	@DisplayName("Contact Last Name shall not be null")
	void testLastNamenotNull() {
		Contact contact = new Contact(firstName, "null", "PhoneNumber", "Address");
		assertNotNull(contact.getlastName(), "Last name was null.");
	}
	@Test
	@DisplayName("Phone Number shall not be null")
	void testPhonenotNull() {
		Contact contact = new Contact("firstName", "lastName", "null", "Address");
		assertNotNull(contact.getNumber(), "Phone number was null.");
	}
	@Test
	@DisplayName("Address shall not be null")
	void testAddressnotNull() {
		Contact contact = new Contact("firstName", "lastName", "PhoneNumber", "null");
		assertNotNull(contact.getContactID(), "Contact was null.");
	}
	
	}