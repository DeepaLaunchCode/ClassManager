package com.example.classmanager.controller;

import com.example.classmanager.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final List<Teacher> teachers = new ArrayList<>();

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable String id) {
        return teachers.stream()
                .filter(t -> t.getTeacherId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        teachers.add(teacher);
        return teacher;
    }
}