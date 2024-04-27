package Test;

import java.util.ArrayList;
import Contact.Contact;
import Contact.ContactService;

@testMethodOrder(OrderAnnotation.class)
public class ContactSerivceTest {

	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testupdateFirstName() {
		ContactService sservice = new ContactService();
		service.addContact("Mr.", "Doe", "000111222", "111 Main Street");
		service.updateFistName("John", "1");
		service.displayContactList();
		assertEquals("John", service.getContact("1").getFirstName(), "First name was not updated.");
	}
	
	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testupdateLastName() {
		ContactService sservice = new ContactService();
		service.addContact("Mr.", "Doe", "000111222", "111 Main Street");
		service.updateFistName("Doe", "3");
		service.displayContactList();
		assertEquals("Doe", service.getContact("3").getLastName(""), "Last name was not updated.");
	}
	
	@Test
	@DisplayName("Test to Update phone number.")
	@Order(3)
	void testupdatePhoneNumber() {
		ContactService sservice = new ContactService();
		service.addContact("Mr.", "Doe", "000111222", "111 Main Street");
		service.updatePhoneNumber("0001112222", "5");
		service.displayContactList();
		assertEquals("0001112222", service.getContact("5").getPhoneNumber(), "Phone Number was not updated.");
	}
	
	@Test
	@DisplayName("Test to Update address.")
	@Order(4)
	void testupdateAddress() {
		ContactService sservice = new ContactService();
		service.addContact("Mr.", "Doe", "000111222", "111 Main Street");
		service.updateAddress("222 North Pole Lane", "7");
		service.displayContactList();
		assertEquals("222 North Pole Lane", service.getContact("1").getFirstName(), "First name was not updated.");
	}
	
}
