package com.howibeast.studentsystem.service;

import com.howibeast.studentsystem.model.Student;

import java.util.List;

/**
 * Save & get students
 */
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
