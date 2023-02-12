package com.example.University_Management.student_cotroller;

import com.example.University_Management.student_model.StudentModel;
import com.example.University_Management.student_service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentCotroller {
    private final StudentService studentService;

    public StudentCotroller(StudentService studentService)
    {
        this.studentService=studentService;
    }

    @GetMapping("/find-all-students")
    public List<StudentModel> findAllStudents()
    {
        return studentService.findALl();
    }
    @GetMapping("/find-students/id/{id}")
    public StudentModel findStudentById(@PathVariable int id)
    {
        return studentService.findStudentById(id);
    }
    @PostMapping("/add-students")
    public void addStudents(@RequestBody StudentModel studentmodel)
    {
        studentService.addStudents(studentmodel);
    }
    @DeleteMapping("/delete-students")
    public void deleteStudents(@PathVariable int id)
    {
        studentService.deleteStudents(id);
    }
    @PutMapping("/update-students/id/{id}")
    public void updateStudents(@PathVariable int id,@RequestBody StudentModel studentmodel)
    {
        studentService.updateStudents(id,studentmodel);
    }
}
