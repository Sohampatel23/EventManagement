package com.submit.Event.management.controller;

import com.submit.Event.management.model.Student;
import com.submit.Event.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Long studentId) {
        return studentService.findById(studentId);

    }

    @PutMapping("updatestudent/id/{id}/name/{name}")
    public String updateSalaryById(@PathVariable Long Id,@PathVariable  String name)
    {
        return studentService.updateName(Id,name);
    }

    @DeleteMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        return studentService.deleteById(studentId);
    }
}
