package com.school.controllers;

import com.school.models.Grade;
import com.school.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("grade")
@RestController
public class GradeController {

    @Autowired
    GradeService gradeService;


    @GetMapping
    @RequestMapping("{id}")
    public List<Grade> getOneStudentGrades(@PathVariable Integer id){
         return gradeService.allGrades(id);
    }

@PostMapping
    public void addGrade(@RequestBody Grade grade){
        gradeService.addGrade(grade);

    }
}
