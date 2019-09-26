package com.springboot.controller;

import com.springboot.bean.Student;
import com.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/query")
    public Student queryStudentById(Integer id){
        return this.studentService.queryStudentById(id);
    }
}
