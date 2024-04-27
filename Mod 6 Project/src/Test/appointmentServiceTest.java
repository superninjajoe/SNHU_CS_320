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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;

import Appointment.Appointment;
import Appointment.appointmentService;

class appointmentSeriveTest {

	private Date Date(int i, int january, int j) {
		return null;
	}
	
	@Test
	@DisplayName("Appointment date update test")
	@Order(1)
	void testUpdateAppointmentDate() {
		appointmentService service = new appointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.updateAppointmentDate(Date(3024, Calendar.FEBRUARY, 2), "7");
		service.displayAppointmentList();
		assertEquals(Date(3024, Calendar.FEBRUARY, 2), service.getAppointment("7").getAppointmentDate(), "Appointment date was not updated.");
	}

	@Test
	@DisplayName("Test to Update appointment description.")
	@Order(2)
	void testUpdateAppointmentDesc() {
		appointmentService service = new appointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.updateAppointmentDesc("Updated Description", "9");
		service.displayAppointmentList();
		assertEquals("Updated Description", service.getAppointment("9").getAppointmentDesc(), "Appointment description was not updated.");
	}

	@Test
	@DisplayName("Test to ensure that service correctly deletes appointments.")
	@Order(3)
	void testDeleteAppointment() {
		appointmentService service = new appointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.deleteAppointment("11");
		ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
		service.displayAppointmentList();
		assertEquals(service.appointmentList, appointmentListEmpty, "The appointment was not deleted.");
	}

	@Test
	@DisplayName("Test to ensure that service can add an appointment.")
	@Order(4)
	void testAddAppointment() {
		appointmentService service = new appointmentService();
		service.addAppointment(Date(2024, Calendar.JANUARY, 1), "Description");
		service.displayAppointmentList();
		assertNotNull(service.getAppointment("1"), "Appointment was not added correctly.");
	}
}
