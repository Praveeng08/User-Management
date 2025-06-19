package com.example.JPADemo.Repository;

import com.example.JPADemo.Modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByTechnology(String technology);

    @Query(nativeQuery = true, value = "Select * from student where name =: name and technology =: technology")
    List<Student> findByNameAndTechnology(@Param("name") String name, @Param("technology") String technology);
}
