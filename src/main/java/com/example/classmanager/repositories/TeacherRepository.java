package com.example.classmanager.repositories;

import com.example.classmanager.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
    // Additional query methods can be defined here if needed
}