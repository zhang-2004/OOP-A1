public class GeneralPractitioner extends HealthProfessional {
    // 额外的实例变量（如果需要）
    // 例如：专业领域等
    private String specialty;

    // 默认构造函数
    public GeneralPractitioner() {
        super();
    }

    // 第二个构造函数
    public GeneralPractitioner(int id, String name, String specialty) {
        super(id, name, "General Practitioner");
        this.specialty = specialty;
    }

    // 打印医疗专业人员详细信息的方法
    @Override
    public String toString() {
        StringBuilder jie = new StringBuilder(super.toString());
        jie.append("Specialty: ").append(specialty).append("\n");
        return jie.toString();
    }
}