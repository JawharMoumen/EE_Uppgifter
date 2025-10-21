package com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Controller;

import com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;


    }

    @GetMapping("/student")
    public String getStudent() {
        return studentService.getStudentInfo(1L);

    }
}
