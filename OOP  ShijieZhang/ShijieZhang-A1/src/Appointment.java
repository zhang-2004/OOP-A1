public class Appointment {
    private String patientName;
    private String phoneNumber;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {}

    // The second constructor
    public Appointment(String patientName, String phoneNumber, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Getter method
    public String getPatientName() {
        return patientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // A method to print all instance variables
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment Details:\n");
        sb.append("Patient Name: ").append(patientName).append("\n");
        sb.append("Phone Number: ").append(phoneNumber).append("\n");
        sb.append("Preferred Time Slot: ").append(preferredTimeSlot).append("\n");
        sb.append("Doctor: ").append(selectedDoctor.toString()).append("\n");
        return sb.toString();
    }
}