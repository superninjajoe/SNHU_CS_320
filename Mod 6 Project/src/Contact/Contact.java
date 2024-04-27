//SNHU
// CS-320
//3-2 Milestone
//Josh Cantu
//3-24-2024

package Contact;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public Contact(String firstName, String lastName, String number, String address) {
	} {
		
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		if (firstName == null || firstName.isEmpty()) {
				this.firstName = "NULL";
		}else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		}
		if (lastName == null || lastName.isEmpty()) {
				this.lastName = "NULL";
		} else if (lastName.length() > 10) {
				this.lastName = lastName.substring(0, 10);

		}
		if (number == null || number.isEmpty() || number.length() !=10) {
			this.number = "0001112222";

		}
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		
		}
	}

	public String getContactID() {
		return contactID;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	public void setfirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		} else if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);

		}
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);

		}
	}
	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "0001112222";

		}
	}
	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);

		}
	}
}

