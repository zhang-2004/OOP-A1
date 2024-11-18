import java.util.ArrayList;

// 假设 HealthProfessional, GeneralPractitioner, Specialist, 和 Appointment 类已经正确实现
// 且每个类都有合适的构造函数和 toString() 方法

public class AssignmentOne {
    public static void main(String[] args) {
        // 第 3 部分 - 使用类和对象
        HealthProfessional gp1 = new GeneralPractitioner(322, "Dr. Zhang", "General Practitioner");
        HealthProfessional gp2 = new GeneralPractitioner(252, "Dr. Liu", "Family Medicine Specialist");
        HealthProfessional specialist1 = new Specialist(355, "Dr. Hu", "Cardiologist");
        HealthProfessional specialist2 = new Specialist(471, "Dr. Mu", "Neurologist");

        System.out.println(gp1.toString());
        System.out.println(gp2.toString());
        System.out.println(specialist1.toString());
        System.out.println(specialist2.toString());
        System.out.println("--------------------------------");

        // 第 5 部分 - 预约收款（这里应该是“预约集合”或“预约列表”的意思）
        ArrayList<Appointment> appointments = new ArrayList<>();

        appointments.add(new Appointment("John Doe", "151-006-5372", "09:00", gp1));
        appointments.add(new Appointment("Jane Smith", "172-112-5541", "10:30", gp2));
        appointments.add(new Appointment("Alice Johnson", "189-554-7321", "14:00", specialist1));
        appointments.add(new Appointment("Bob Brown", "160-779-5489", "15:30", specialist2));

        printExistingAppointments(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);
    }

    // 打印现有预约的方法
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

    // 取消预约的方法
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
