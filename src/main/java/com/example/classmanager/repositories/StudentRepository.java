package com.example.classmanager.repositories;

import com.example.classmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // Additional query methods can be defined here if needed
}
