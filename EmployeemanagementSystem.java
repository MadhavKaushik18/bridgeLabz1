
public class EmployeemanagementSystem {
	    public static void main(String[] args) {
	        // Create Employees
	        Employee e1 = new FullTimeEmployee(1, "Alice", 40000);
	        Employee e2 = new PartTimeEmployee(2, "Bob", 500, 30);

	        // Assign departments
	        ((Department) e1).setDepartment("HR");
	        ((Department) e2).setDepartment("IT");

	        // Store in array for polymorphism
	        Employee[] employees = {e1, e2};

	        // Show details
	        for (Employee e : employees) {
	            e.showDetails();
	        }
	    }

}
interface Department {
    void setDepartment(String dept);
    String getDepartment();
}

// Abstract Class Employee
abstract class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // Abstract method
    public abstract double calculateSalary();

    // Normal method
    public void showDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

// Full Time Employee Class
class FullTimeEmployee extends Employee implements Department {
    private String dept;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        // For full-time employee, salary is fixed
        return getSalary();
    }

    @Override
    public void setDepartment(String dept) {
        this.dept = dept;
    }

    @Override
    public String getDepartment() {
        return dept;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + dept);
        System.out.println("-------------------");
    }
}

// Part Time Employee Class
class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private double rate;
    private String dept;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0); // Base salary not fixed
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return rate * hours;
    }

    @Override
    public void setDepartment(String dept) {
        this.dept = dept;
    }

    @Override
    public String getDepartment() {
        return dept;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
        System.out.println("Department: " + dept);
        System.out.println("-------------------");
    }
}


