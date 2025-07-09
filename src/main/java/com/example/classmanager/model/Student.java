package com.example.classmanager.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Map;

@Entity
public class Student {
    @Id
    private String studentId;
    private String name;

    @ElementCollection
    private List<String> schedule;

    @ElementCollection
    private Map<String, Double> grades;

    public Student() {}

    public Student(String studentId, String name, List<String> schedule, Map<String, Double> grades) {
        this.studentId = studentId;
        this.name = name;
        this.schedule = schedule;
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }
}