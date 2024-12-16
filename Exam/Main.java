import java.util.Scanner;
//Base Class Person
class Person {
    //protected variables to inherit the subclass
    protected String name;
    protected int age;
    //Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //display the output
    void displayInfo() {
        System.out.print("Name: " + name + ", Age: " + age);
    }
}
//subclass Student
class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;
    //Constructor
    Student(String name, int age, String studentID, String course, int units) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    //calculate the units and feePerUnit
    double calculateFees() {
        return units * feePerUnit;
    }
    //display the output
    void displayInfo() {
        System.out.println("<~~~~~~~~~Student Info~~~~~~~~~>");
        System.out.println(name);
        System.out.println(age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Units fee: " + calculateFees());
        System.out.println();
    }
    //input the information
    static Student createStudentFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Enter student ID: ");
        String studentID = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        System.out.println();
        return new Student(name, age, studentID, course, units);
    }
}
//subclass Instructor
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;
    //Constructor
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    //display the output
    void displayInfo() {
        System.out.println("<~~~~~~~~~Instructor Info~~~~~~~~~>");
        System.out.println(name);
        System.out.println(age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
    //input the information
    static Instructor createInstructorFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter instructor name: ");
        String name = sc.nextLine();
        System.out.print("Enter instructor age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Enter employee ID: ");
        String employeeID = sc.nextLine();
        System.out.print("Enter department: ");
        String department = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println();
        return new Instructor(name, age, employeeID, department, salary);
    }
}
//Main class
public class Main {
    //to print the details of the class
    static void printDetails(Person p) {
        p.displayInfo();
    }

    public static void main(String[] args) {
        //Call out the Class or Subclass
        Student s = Student.createStudentFromInput();
        printDetails(s);

        Instructor i = Instructor.createInstructorFromInput();
        printDetails(i);
    }
}
