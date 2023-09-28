package com.submit.Event.management.service;

import com.submit.Event.management.model.Student;
import com.submit.Event.management.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String save(Student student) {
        iStudentRepo.save(student);
        return "Student Added";
    }

    public List<Student> findAll() {
        return (List<Student>) iStudentRepo.findAll();
    }

    public Student findById(Long studentId) {
        return iStudentRepo.findById(studentId).get();
    }

    public String updateName(Long id, String name) {

            Student student = iStudentRepo.findById(id).orElse(null);
            if(student != null)
            {
                student.setFirstName(name);
                iStudentRepo.save(student);
                return "Student updated!!";
            }
            else {
                return "Student not found!";
            }

    }

    public String deleteById(Long studentId) {
        iStudentRepo.deleteById(studentId);
        return "Student deleted";
    }
}
