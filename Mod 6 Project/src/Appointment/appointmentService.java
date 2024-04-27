/*
 * Name: Josh Cantu
 * Course: CS-320
 * Date: 4/6/2024
 * 
 * This class maintains appointments. Allows the changes of any appointment listed.
 * 
 */
package Appointment;

import java.util.ArrayList;
import java.util.Date;

public class appointmentService {

		public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		
// Displays list of appointments.
		public void displayAppointmentList() {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				System.out.println("\t Appointment ID: " + appointmentList.get(counter).getAppointmentID());
				System.out.println("\t Appointment Date: " + appointmentList.get(counter).getAppointmentDate());
				System.out.println("\t Appointment Description: " + appointmentList.get(counter).getAppointmentDesc());
			}
		}

// Add an appointment and then places it in the list. 
		public void addAppointment(Date appointmentDate, String appointmentDesc) {
			Appointment appointment = new Appointment(appointmentDate, appointmentDesc);
			appointmentList.add(appointment);
		}

		
//Pulls up appointment information.
//Appointment ID is required. If none is found, it will return the object with default values.
		
		public Appointment getAppointment(String appointmentID) {
			Appointment appointment = new Appointment(null, null);
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().contentEquals(appointmentID)) {
					appointment = appointmentList.get(counter);
				}
			}
			return appointment;
		}

// Allows the appointment to be canceled or deleted		
		public void deleteAppointment(String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.remove(counter);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}
// Allows changes to appointment date.
		public void updateAppointmentDate(Date updatedDate, String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.get(counter).setAppointmentDate(updatedDate);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}
// Allows appointment description to be changed.
		public void updateAppointmentDesc(String updatedString, String appointmentID) {
			for (int counter = 0; counter < appointmentList.size(); counter++) {
				if (appointmentList.get(counter).getAppointmentID().equals(appointmentID)) {
					appointmentList.get(counter).setAppointmentDesc(updatedString);
					break;
				}
				if (counter == appointmentList.size() - 1) {
					System.out.println("Appointment ID: " + appointmentID + " not found.");
				}
			}
		}
	
}
