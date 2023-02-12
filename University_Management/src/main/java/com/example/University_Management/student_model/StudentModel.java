package com.example.University_Management.student_model;

public class StudentModel {

    private int id;
    private String f_name;
    private String l_name;
    private int age;
    private String dept;

    public StudentModel()
    {

    }

    public StudentModel(int id, String f_name, String l_name, int age, String dept)
    {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
