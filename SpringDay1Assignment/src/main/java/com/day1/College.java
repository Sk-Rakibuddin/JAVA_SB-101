package com.day1;

public class College {

    private  String college_name;
    private String college_address;
    private Student student;

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getCollege_address() {
        return college_address;
    }

    public void setCollege_address(String college_address) {
        this.college_address = college_address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public void showDetails(){
        System.out.println("Collage Name is :"+college_name);
        System.out.println("Collage Address is :"+college_address);
        System.out.println("Collage Student is :"+student);
    }
}
