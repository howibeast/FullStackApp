package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Student;

import java.util.List;

/**
 * Save & get students
 */
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
