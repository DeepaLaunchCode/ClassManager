package com.example.classmanager.model;

import java.util.List;
import java.util.Map;

public class Student {
    private String studentId;
    private List<String> schedule;
    private Map<String, Double> grades;

    public Student() {}

    public Student(String studentId, List<String> schedule, Map<String, Double> grades) {
        this.studentId = studentId;
        this.schedule = schedule;
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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