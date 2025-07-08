package com.example.classmanager.model;

import java.util.List;

public class Teacher {
    private String teacherId;
    private List<String> classesTaught;

    public Teacher() {}

    public Teacher(String teacherId, List<String> classesTaught) {
        this.teacherId = teacherId;
        this.classesTaught = classesTaught;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public List<String> getClassesTaught() {
        return classesTaught;
    }

    public void setClassesTaught(List<String> classesTaught) {
        this.classesTaught = classesTaught;
    }
}