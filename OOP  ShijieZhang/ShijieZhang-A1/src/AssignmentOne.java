/*
 * Name:Shijie Zhang
 * Student ID:24517351
 */

import java.util.ArrayList;

// It is assumed that the HealthProfessional, GeneralPractitioner, Specialist, and Appointment classes have been implemented correctly
// And each class has a suitable constructor and toString() method

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 - Working with Classes and Objects
        HealthProfessional gp1 = new GeneralPractitioner(322, "Dr. Zhang", "General Practitioner");
        HealthProfessional gp2 = new GeneralPractitioner(252, "Dr. Liu", "Family Medicine Specialist");
        HealthProfessional specialist1 = new Specialist(355, "Dr. Hu", "Cardiologist");
        HealthProfessional specialist2 = new Specialist(471, "Dr. Mu", "Neurologist");
        HealthProfessional gp3 = new GeneralPractitioner(552, "Dr. Sun", "Family Medicine Specialist");


        System.out.println(gp1.toString());
        System.out.println(gp2.toString());
        System.out.println(specialist1.toString());
        System.out.println(specialist2.toString());
        System.out.println(gp3.toString());
        System.out.println("--------------------------------");

        // Section 5 - Appointment Collection (this should mean "Appointment Collection" or "Reservation List")
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("Shijie Zhang", "151-006-5372", "09:00", gp1));
        appointments.add(new Appointment("Haonan Liu", "172-112-5541", "10:30", gp2));
        appointments.add(new Appointment("Haonan Hu", "189-554-7321", "14:00", specialist1));
        appointments.add(new Appointment("Shaoqian Mu", "160-779-5489", "15:30", specialist2));

        printExistingAppointments(appointments);
        cancelBooking(appointments, "151-006-5372");
        printExistingAppointments(appointments);
    }

    // How to print an existing appointment
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Print existing appointment.");
            for (Appointment appointment : appointments) {
                System.out.println(appointment.toString());
            }
        }
    }

    // How to cancel your reservation
    public static void cancelBooking(ArrayList<Appointment> appointments, String phoneNumber) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPhoneNumber().equals(phoneNumber)) {
                appointments.remove(i);
                found = true;
                System.out.println("Appointment for patient with phone " + phoneNumber + " has been cancelled.");
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found for the provided phone number.");
        }
    }
}

