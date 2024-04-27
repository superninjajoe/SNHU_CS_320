/*
 * Name: Josh Cantu
 * Course: CS-320
 * Date: 4/6/2024
 * 
 * This class creates and stores appointment information
 * 
 */

package Appointment;

import java.util.Calendar;
import java.util.Date;

public class Appointment {

	private final String appointmentID;
	private Date appointmentDate;
	private String appointmentDesc;
	
	@SuppressWarnings("deprecation")
	public Appointment(Date appointmentDate, String appointmentDesc) {
		
		this.appointmentID = String.valueOf(idGenerator.getAndIncrement());
		
		if (appointmentDate == null) {
			this.appointmentDate = new Date(2025, Calendar.JANUARY, 1);
		} else if (appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Cannot make appointment before current date.");
		} else {
			this.appointmentDate = appointmentDate;
		}
		
		if (appointmentDesc == null || appointmentDesc.isEmpty()) {
			this.appointmentDesc = "NULL";
		} else if (appointmentDesc.length() > 50) {
			this.appointmentDesc = appointmentDesc.substring(0, 50);
		} else {
			this.appointmentDesc = appointmentDesc;
		}
	}

	public String getAppointmentID() {
		return appointmentID;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public String getAppointmentDesc() {
		return appointmentDesc;
	}
	

	@SuppressWarnings("deprecation")
	public void setAppointmentDate(Date appointmentDate) {
		if (appointmentDate == null) {
			appointmentDate = new Date(2025, Calendar.JANUARY, 1);
		} else if (appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Cannot make appointment before current date.");
		} else {
			this.appointmentDate = appointmentDate;
		}
	}
	
	public void setAppointmentID(String appointmentID) {
		if (appointmentDesc == null || appointmentID.isEmpty()) {
			this.appointmentID = "NULL";
		} else if (appointmentID.length() > 10) {
			this.appointmentID = appointmentID.substring(0, 10);
		} else {
			this.appointmentID = appointmentID;
		}
		
	public void setAppointmentDesc(String appointmentDesc) {
		if (appointmentDesc == null || appointmentDesc.isEmpty()) {
			this.appointmentDesc = "NULL";
		} else if (appointmentDesc.length() > 50) {
			this.appointmentDesc = appointmentDesc.substring(0, 50);
		} else {
			this.appointmentDesc = appointmentDesc;
		}
	}
}
	
