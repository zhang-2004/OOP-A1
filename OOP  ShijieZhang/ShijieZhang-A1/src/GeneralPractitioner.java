public class GeneralPractitioner extends HealthProfessional {
    // Additional instance variables (if needed)
    // For example: professional field, etc
    private String specialty;

    // Default constructor
    public GeneralPractitioner() {
        super();
    }

    // The second constructor
    public GeneralPractitioner(int id, String name, String specialty) {
        super(id, name, "General Practitioner");
        this.specialty = specialty;
    }

    // Ways to print the details of a medical professional
    @Override
    public String toString() {
        StringBuilder jie = new StringBuilder(super.toString());
        jie.append("Specialty: ").append(specialty).append("\n");
        return jie.toString();
    }
}