package com.school.services;

import com.school.models.Student;
import com.school.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentsRepository studentsRepository;

    public List<Student> getAllStudents(){
        return studentsRepository.findAll();

    }

    public Student getOneStudent(Integer id){
        return studentsRepository.getOne(id);
    }



    public void addStudent(Student student){
        studentsRepository.saveAndFlush(student);

    }

}
