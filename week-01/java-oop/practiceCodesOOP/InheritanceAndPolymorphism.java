  package com.quenedy.oop;

//Abstract class
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    //Abstract - each employee type calculates differently
    abstract double calculateSalary();

    //Shared Method
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

    //Full-time employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); //call parent constructor
        this.monthlySalary = monthlySalary;
    }
    @Override
        double calculateSalary() {
        return monthlySalary;
  }
}

//Part-time employee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hourWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hourWorked ) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }
    @Override
    double calculateSalary() {
        return hourlyRate * hourWorked;
    }
}
//Freelancer
class FreeLancer extends Employee {
    private double projectRate;
    private int projectsComplete;

    public FreeLancer(String name, int id, double projectRate, int projectsComplete) {
        super(name, id);
        this.projectRate = projectRate;
        this.projectsComplete = projectsComplete;
    }
    @Override
    double calculateSalary() {
        return projectRate * projectsComplete;
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args) {

        //Polymorphism - all stored as Employee
        Employee[] employees = {
                new FullTimeEmployee("Quenedy", 1001, 50000.0),
                new PartTimeEmployee("Ralph", 1002, 150.0, 80),
                new FreeLancer("Mark", 1003, 5000.0, 3),
        };

        System.out.println("=== PAYROLL SYSTEM ===");
        System.out.println();


        // Same loop handles ALL employee types!
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Type: " +
                    emp.getClass().getSimpleName());
            System.out.println();
        }
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateSalary();
        }
        System.out.println("Total Payroll: " + total);
    }
}

