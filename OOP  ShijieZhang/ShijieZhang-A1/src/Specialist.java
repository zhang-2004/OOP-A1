public class Specialist extends HealthProfessional {
    // 额外的实例变量（如果需要）
    // 例如：专业领域、医院名称等
    private String specialty;
    private String hospitalName;

    // Default constructor
    public Specialist() {
        super();
    }

    // The second constructor
    public Specialist(int id, String name, String specialty, String hospitalName) {
        super(id, name, "Specialist");
        this.specialty = specialty;
        this.hospitalName = hospitalName;
    }

    //Simplifying the constructor
    public Specialist(int id, String name, String specialty) {
        this(id, name, specialty, "General Hospital");
    }

    // Ways to print the details of a medical professional
    @Override
    public String toString() {
        StringBuilder jie = new StringBuilder(super.toString().replace("Description: Specialist", "Description: Medical Specialist")); // 修改描述以区分
        jie.append("Specialty: ").append(specialty).append("\n");
        jie.append("Hospital: ").append(hospitalName).append("\n");
        return jie.toString();
    }
}