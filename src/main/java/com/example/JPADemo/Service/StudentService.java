package com.example.JPADemo.Service;

import com.example.JPADemo.Modal.Student;
import com.example.JPADemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void updateStudents(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public void addStudents(Student student) {
        studentRepo.save(student);
    }


    public Student getStudentById(int id) {
       return studentRepo.findById(id).orElse(new Student());
    }

    public void deleteStudents(int id) {
        studentRepo.deleteById(id);
    }

    public void deleteAll(Student student) {
        studentRepo.deleteAll();
    }


    public List<Student> getStudentByTechnology(String technology) {
        return studentRepo.findByTechnology(technology);
    }

    public List<Student> getStudentByNameAndTechnology(String name, String technology) {
        return studentRepo.findByNameAndTechnology(name, technology);
    }
}
