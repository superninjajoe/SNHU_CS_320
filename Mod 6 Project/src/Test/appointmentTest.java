/*
 * Name: Josh Cantu
 * Course: CS-320
 * Date: 4/6/2024
 * 
 * Class test
 * 
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;

class appointmentTest {

	private Date Date(int i, int january, int j) {
		return null;
	}
	
	@Test
	@DisplayName("Appointment ID cannot have more than 10 characters")
	void testAppointmentIDWithMoreThanTenCharacters() {
		Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "Description");
		if (appointment.getAppointmentID().length() > 10) {
			fail("Appointment ID has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("Task Description cannot have more than 50 characters")
	void testAppointmentDescWithMoreThanFiftyCharacters() {
		Appointment appointment = new Appointment(Date(2024, Calendar.JANUARY, 1), "brown fox jumps over the lazy dog" 
				+ "brown fox jumps over the lazy dog");
		if (appointment.getAppointmentDesc().length() > 50) {
			fail("Appointment Description has more than 50 characters.");
		}
	}
	
	@Test
	@DisplayName("Appointment Date cannot be before current date")
	void testAppointmentDateBeforeCurrent() {
		Appointment appointment = new Appointment(Date (2024, Calendar.JANUARY, 1), "Description");
		if (appointment.getAppointmentDate().before(new Date())) {
			fail("Appointment Date is before current date.");
		}
	}

	@Test
	@DisplayName("Task Date shall not be null")
	void testAppointmentDateNotNull() {
		Appointment appointment = new Appointment(null, "Description");
		assertNotNull(appointment.getAppointmentDate(), "Appointment Date was null.");
	}
	
	@Test
	@DisplayName("Task Description shall not be null")
	void testAppointmentDescNotNull() {
		Appointment task = new Appointment(Date(2024, Calendar.JANUARY, 1), null);
		assertNotNull(task.getAppointmentDesc(), "Appointment Description was null.");
	}
}
