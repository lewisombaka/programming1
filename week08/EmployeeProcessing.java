package week08;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years - " + department + " - $" + salary;
    }
}

public class EmployeeProcessing {

    public static void main(String[] args) {
        // Step 1: Reading and storing the dataset
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 28, "HR", 50000),
            new Employee("Bob", 35, "IT", 75000),
            new Employee("Charlie", 40, "Finance", 60000),
            new Employee("Diana", 32, "IT", 80000)
        );

        // Step 2: Define Function interface for concatenated string
        Function<Employee, String> nameAndDepartment = emp -> emp.getName() + " - " + emp.getDepartment();

        // Step 3: Using streams to create a new collection
        List<String> nameDepartmentCollection = employees.stream()
            .map(nameAndDepartment)
            .collect(Collectors.toList());

        System.out.println("Concatenated Name and Department:");
        nameDepartmentCollection.forEach(System.out::println);

        // Step 4: Calculate average salary using streams
        double averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Average Salary: $" + averageSalary);

        // Step 5: Dynamic filter for age threshold
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age threshold:");
        int ageThreshold = scanner.nextInt();

        List<Employee> filteredEmployees = employees.stream()
            .filter(emp -> emp.getAge() > ageThreshold)
            .collect(Collectors.toList());

        System.out.println("Employees above age " + ageThreshold + ":");
        filteredEmployees.forEach(System.out::println);

        // Step 6: Sorting employees by salary
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());

        System.out.println("Employees sorted by salary (ascending):");
        sortedEmployees.forEach(System.out::println);

        scanner.close();
    }
}
