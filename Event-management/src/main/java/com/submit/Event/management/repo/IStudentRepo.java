package com.submit.Event.management.repo;

import com.submit.Event.management.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Long> {
}
