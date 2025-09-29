package com.anantmittal.dsa_cp.OOPJ_Class;

class Student_29 {
    private String name;

    Student_29() {}
    Student_29(String name) {
        setName(name);
    }

    public void SportsClub() {
        System.out.println("Sports Club");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Sports_KIET_Society extends Student_29 {
    Sports_KIET_Society() {
        super();
    }
    Sports_KIET_Society(String name) {
        super(name);
    }

    @Override
    public void SportsClub() {
        super.SportsClub();
        System.out.println("Sports KIET Society");
    }
}

public class Q1_29_09 {
    public static void main(String[] args) {
        Student_29 student1 = new Sports_KIET_Society();
        student1.SportsClub();

        Student_29 student2 = new Sports_KIET_Society("John Doe");
        System.out.println(student2.getName());
        student2.SportsClub();
    }
}
