package com.example.JPADemo.Controller;

import com.example.JPADemo.Modal.Student;
import com.example.JPADemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/students")
    public String addStudents(@RequestBody Student student){
        studentService.addStudents(student);
        return "Added..";
    }
    @PutMapping("/students")
    public String updateStudents(@RequestBody Student student){
        studentService.updateStudents(student);
        return "Updated..";
    }

    @DeleteMapping("students/{id}")
    public String deleteStudents(@PathVariable("id") int id ){
        studentService.deleteStudents(id);
        return "Deleted Sucessfully...";
    }

    @DeleteMapping("students/clear")
    public String deleteAll(@RequestBody Student student){
        studentService.deleteAll(student);
        return "Deleted all";
    }

    @GetMapping("students/technology/{tech}")
    public List<Student> getStudentsByTechnology(@PathVariable("tech") String technology){
        return studentService.getStudentByTechnology(technology);
    }

    @GetMapping("students/filter")
    public List<Student> getStudentByAgeAndTechnology(@Param("name") String name, @Param("technology") String technology){
        return studentService.getStudentByNameAndTechnology(name,technology);
    }

}
