package com.example.University_Management.student_service;

import com.example.University_Management.student_model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class StudentService {

    private static List<StudentModel> students = new ArrayList<>();
    private static int stud_count=0;

    static
    {
        students.add(new StudentModel(++stud_count,"Shalin","Bhanot",24,"Mechanical"));
        students.add(new StudentModel(++stud_count,"Shiv","Thakre",23,"Chemical"));
        students.add(new StudentModel(++stud_count,"Mc","Stan",20,"Civil"));
        students.add(new StudentModel(++stud_count,"Salman","Khan",22,"Electrical"));
        students.add(new StudentModel(++stud_count,"Priyanka","Chowdhry",21,"Electronics"));
        students.add(new StudentModel(++stud_count,"Archana","Gautamt",24,"Computer"));
    }

    public List<StudentModel> findALl()
    {
        return students;
    }

    public StudentModel findStudentById(int id)
    {
        Predicate<? super StudentModel> predicate = studentmodel -> studentmodel.getId() == id;
        StudentModel studentmodel = students.stream().filter(predicate).findFirst().get();
        return studentmodel;
    }

    public void addStudents(StudentModel studentmodel)
    {
        students.add(studentmodel);
    }

    public void deleteStudents(int id)
    {
        Predicate<? super StudentModel> predicate = studentmodel -> studentmodel.getId() == id;
        students.removeIf(predicate);
    }

    public void updateStudents(int id,StudentModel newStudent)
    {
        StudentModel studentmodel = findStudentById(id);
        studentmodel.setId(newStudent.getId());
        studentmodel.setF_name(newStudent.getF_name());
        studentmodel.setL_name(newStudent.getL_name());
        studentmodel.setAge(newStudent.getAge());
        studentmodel.setDept(newStudent.getDept());

    }

}
