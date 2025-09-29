package com.anantmittal.dsa_cp.OOPJ_Class;

class LowMarksException extends Exception {
    public LowMarksException(String message) {
        super(message);
    }
}

class Student_26 {
    private final String name;
    private final int marks;

    public Student_26(String name, int marks) {
        this.name = name;
        this.marks = marks;
        System.out.println("Student object created for " + this.name + ".");
    }

    public void display() throws LowMarksException {
        System.out.println("\n--- Displaying Student Data ---");
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);

        if (this.marks < 40) {
            throw new LowMarksException("Marks are below 40%. The student has failed.");
        } else {
            System.out.println("Result: Passed");
        }
        System.out.println("-----------------------------");
    }
}
public class Q1_26_09 {
    public static void main(String[] args) {
        System.out.println("--- Program Start ---");

        try {
            Student_26 student1 = new Student_26("Alice", 85);
            student1.display();
        } catch (LowMarksException e) {
            System.err.println("\nCaught Exception: " + e.getMessage());
        }

        System.out.println("\n--- Next Student ---");

        try {
            Student_26 student2 = new Student_26("Bob", 38);
            student2.display();
        } catch (LowMarksException e) {
            System.err.println("\nCaught Exception for Bob: " + e.getMessage());
            System.err.println("Further processing for this student might be required.");
        }

        System.out.println("\n--- Program End ---");
    }
}
