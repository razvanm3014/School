package com.school.controllers;
import com.school.models.Student;
import com.school.repositories.StudentsRepository;
import com.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @GetMapping("{id}")
    public Student getOneStudent(@PathVariable Integer id){
        return studentService.getOneStudent(id);


   }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
}
