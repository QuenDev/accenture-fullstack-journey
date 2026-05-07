package com.quenedy.oop;

//1. Interfaces
interface Payable {
    double calculateSalary();
}

interface Reportable {
    void generateReport();
}

//2. Strategy Pattern = Grade Calculation
interface GradeStrategy{
    String calculate(int score);
}

class StandardGrade implements GradeStrategy {
    public String calculate(int score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else return "F";
    }
}

class CurvedGrade implements GradeStrategy {
    public String calculate(int score) {
        score += 5;
        if (score >= 90) return "A";
        else if (score>=80) return "B";
        else if (score >= 70) return "C";
        else return "F";
    }
}

class GradeCalculator {
    private GradeStrategy strategy;

    public GradeCalculator(GradeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(GradeStrategy strategy) {
        this.strategy = strategy;
    }

    public String calculate(int score) {
        return strategy.calculate(score);
    }
}

//3. Full employee using both interfaces
class Developer implements Payable, Reportable {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() { return salary; }

    @Override
    public void generateReport() {
        System.out.println("Developer: " + name +
                " | Salary: " + calculateSalary());
    }
}


public class InterfacesAndPatterns {
    public static void main(String[] args) {

        //Strategy Pattern demo
        System.out.println("=== GRADE CALCULATOR ===");
        GradeCalculator calc = new GradeCalculator(new StandardGrade());
        System.out.println("Standard 85: " + calc.calculate(85));

        //Swap Strategy
        calc.setStrategy(new CurvedGrade());
        System.out.println("Curved 85: " + calc.calculate(85));

        System.out.println();

        //Interface Demo
        System.out.println("=== DEVELOPER REPORT ===");
        Developer dev = new Developer("Quenedy", 20000.0);
        dev.generateReport();

        // Dependency Inversion
        System.out.println();
        System.out.println("=== PAYROLL PROCESSING ===");

        Payable[] payables = {
                new Developer("Ken", 50000.0),
                new Developer("Ken", 50000.0),
                new Developer("Ken", 50000.0),
        };

        double total = 0;
        for (Payable p : payables) {
            total += p.calculateSalary();
        }
        System.out.println("Total Payouts: " + total);
    }
}
