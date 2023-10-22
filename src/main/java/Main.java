public class Main {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook("Employee's Phonebook");
        pb.addEmployee(Employee.createEmployee("John", "9916897", "10"));
        pb.addEmployee(Employee.createEmployee("Mike", "9999999", "1"));
        pb.addEmployee(Employee.createEmployee( "Ольга", "1111111", "12"));
        pb.addEmployee(Employee.createEmployee( "Василий", "5559877", "0"));
        pb.addEmployee(Employee.createEmployee( "Steeve", "1212355", "10"));
        pb.addEmployee(Employee.createEmployee( "Mike", "9009090", "15"));

        pb.printPhonebook();
        System.out.println("***");

        Phonebook.printSearchResult(pb.searchEmployeeByExperience("10"));
        System.out.println("***");

        Phonebook.printSearchResult(pb.searchEmployeePhoneNumberByName("Mike"));
        System.out.println("***");

        Phonebook.printSearchResult(pb.searchEmployeeById(100002));
        System.out.println("***");


    }
}
