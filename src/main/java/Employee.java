public class Employee {


    private final Integer id;
    private final String phoneNumber;
    private final String name;
    private final String experience;

    private static int index;

    static {
        Employee.index = 100000;
    }

    private Employee(Integer id, String name, String phoneNumber, String experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public static Employee createEmployee(String name, String phoneNumber, String experience) {
        return new Employee(Employee.index++, name, phoneNumber, experience);
    }


    public Integer getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String info = "Employee{" + "id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experience='" + experience + '\'' +
                '}';
        sb.append(info);
//        sb.append("\n");
        return sb.toString();
    }
}
