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
        StringBuilder sb = new StringBuilder();
        sb.append("Health Professional Details:\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Description: ").append(description).append("\n");
        return sb.toString();
    }
}