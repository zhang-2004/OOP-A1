public class HealthProfessional {
    protected int id;
    protected String name;
    protected String description;

    // Default constructor
    public HealthProfessional() {
    }

    // The second constructor
    public HealthProfessional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // A method to print all instance variables
    @Override
    public String toString() {
        StringBuilder jie = new StringBuilder();
        jie.append("Health Professional Details:\n");
        jie.append("Doctor ID: ").append(id).append("\n");
        jie.append(" Doctor Name: ").append(name).append("\n");
        jie.append("Description: ").append(description).append("\n");
        return jie.toString();
    }
}