package com.example.classmanager.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositories extends JpaRepository<Student, Integer> {
    // Additional query methods can be defined here if needed
}
