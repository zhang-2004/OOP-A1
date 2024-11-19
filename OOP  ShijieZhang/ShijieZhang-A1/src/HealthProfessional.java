public class HealthProfessional {
    protected int id;
    protected String name;
    protected String description;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 第二个构造函数
    public HealthProfessional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // 打印所有实例变量的方法
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