package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Studyble;

public class Student implements Studyble, Readable {

    private Teacher teacher;
    private University univer;
    private String scholarReport;
    private String name;

    public Student(String scholarReport, String name) {
        this.scholarReport = scholarReport;
        this.name = name;
    }

    public void setUniver(University univer) {
        this.univer = univer;
    }

    public Teacher getTeacher() {
        return this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public University getUniver() {
        return this.univer = univer;
    }

    public String getScholarReport() {
        return scholarReport;
    }

    public void setScolarReport(String scholarReport) {
        this.scholarReport = scholarReport;
    }

    public void setName(String name) {
        this.scholarReport = scholarReport;
    }

    public String getStudentName() {
        return name;
    }

    @Override
    public void study() {
        read();
        System.out.println("Сдал доклад по теме профессору " + teacher.getName() + "у!");
    }

    @Override
    public void read() {
        System.out.println("Я - студент " + name + ". Читал " + scholarReport + " в библиотеке " + univer.getUniverName() + ". Долго думал.");
    }

}
