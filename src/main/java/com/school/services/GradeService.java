package com.school.services;


import com.school.controllers.StudentController;
import com.school.models.Grade;
import com.school.repositories.GradeRepository;
import com.school.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService {


    @Autowired
    GradeRepository gradeRepository;



    public List <Grade> allGrades(Integer id){
        List<Grade> allGrades = gradeRepository.findAll();
        return allGrades.stream().filter(grade -> grade.getStudent_id() == id ).collect(Collectors.toList());
    }

    public void addGrade(Grade grade){
        gradeRepository.saveAndFlush(grade);
    }
}
