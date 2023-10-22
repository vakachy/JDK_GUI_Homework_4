import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private final String phonebookName;
    List<Employee> employees;

    public Phonebook(String phonebookName) {
        this.phonebookName = phonebookName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> searchEmployeeByExperience(String experience) {
        List<Employee> search = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience().equals(experience)) {
                search.add(employee);
            }
        }
        return search;
    }

    public List<String> searchEmployeePhoneNumberByName(String name) {
        List<String> search = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                search.add(employee.getPhoneNumber());
            }
        }
        return search;
    }

    public Employee searchEmployeeById(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void printPhonebook() {
        System.out.println(phonebookName);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static <T> void printSearchResult(List<T> search) {
        System.out.println("Search result:");
        for (T item : search) {
            System.out.println(item);
        }
    }

    public static void printSearchResult(Employee employee) {
        System.out.println("Search result:");
        System.out.println(employee);
    }
}
