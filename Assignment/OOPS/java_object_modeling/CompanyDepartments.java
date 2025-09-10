import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
}

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Ltd");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.addEmployee(new Employee("Asha"));
        d1.addEmployee(new Employee("Vikram"));
        d2.addEmployee(new Employee("Rohit"));
        company.addDepartment(d1);
        company.addDepartment(d2);
        company.showCompany();
    }
}
