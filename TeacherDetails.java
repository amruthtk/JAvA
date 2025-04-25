import java.util.Scanner;

// Base class
class Employee {
    int empId;
    String name;
    double salary;
    String address;

    // Constructor to initialize employee data
    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    void displayEmployeeDetails() {
        System.out.println("Emp ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}

// Derived class
class Teacher extends Employee {
    String department;
    String subject;

    // Constructor to initialize teacher data (along with employee data)
    Teacher(int empId, String name, double salary, String address, String department, String subject) {
        super(empId, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    void displayTeacherDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("-----------------------------------");
    }
}

// Main class
public class TeacherDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Teacher[] teachers = new Teacher[n];

        // Input teacher details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Subject Taught: ");
            String subject = scanner.nextLine();

            teachers[i] = new Teacher(empId, name, salary, address, department, subject);
        }

        // Display all teachers
        System.out.println("\n=========== Teacher Details ===========");
        for (Teacher teacher : teachers) {
            teacher.displayTeacherDetails();
        }

        scanner.close();
    }
}

