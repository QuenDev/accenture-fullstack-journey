package com.quenedy.oop;    

//1. Simple class with data behavior
class Student {
    //Data(fields)
    String name;
    int score;

    //Behavior method()
    String getGrade() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else return "F";

    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
    }
}

//2. Aggregation example (HAS-A)
class Course {
    String courseName;
    String instructor;
}

class Enrollment {
    Student student;
    Course course;

    void displayEnrollment() {
        System.out.println("\nProf: " + course.instructor + "\n" + student.name + " enrolled in " + course.courseName );
    }
}

//3. Inheritance example (IS-A)
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old");
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

public class OOPBasics {
    public static void main(String[] args) {

        //Test Student Class
        System.out.println("=== Student Test ===");
        Student studentName = new Student();
        studentName.name = "Quen";
        studentName.score = 91;
        studentName.displayInfo();

        System.out.println();

        //Test Aggregation
        System.out.println("=== Enrollment Test ===");
        Student enroleesName = new Student();
        enroleesName.name = "Vic";

        Course java = new Course();
        java.courseName = "Java";
        java.instructor = "Sir Rex";

        Enrollment enrollment = new Enrollment();
        enrollment.student = enroleesName;
        enrollment.course = java;
        enrollment.displayEnrollment();

        System.out.println();

        System.out.println("=== Inheritance Test ===");
        Teacher teacher = new Teacher ();
        teacher.name = "Mark Gonzales";
        teacher.age = 34;
        teacher.subject = "Data Structures and Algorithm";

        teacher.introduce();
        teacher.teach();
    }
}



