package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Studyble;

public class Student implements Studyble, Readable {

    private Teacher teacher;
    private University univer;
    private String scholarReport;
    private String name;


    public void setUniver(String un){
        univer.setUniverName(un);
    }

    public String getUniver() {
        return univer.getUniverName();
    }


    public String getScholarReport() {
        return scholarReport;
    }

    public void setScolarReport(String scholarReport){
        this.scholarReport = scholarReport;
    }

    public void setName(String name){
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
        System.out.println("Читал " + scholarReport + " в библиотеке " + univer.getUniverName() + ". Долго думал.");
    }

}
