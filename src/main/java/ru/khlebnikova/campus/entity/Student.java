package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Studyble;

public class Student implements Studyble, Readable {

    Teacher professor;
    University univer;
    private final String scholarReport = "Переписку Ленина с Каутским";
    public final String name = "Феофанов";

    @Override
    public void study() {
        read();
        System.out.println("Сдал доклад по теме профессору " + professor.getTeacherName() + "у!");
    }

    @Override
    public void read() {
        System.out.println("Читал " + getScholarReport() + " в библиотеке " +  univer.getUniverName() + ". Долго думал.");
    }


    public String getScholarReport() {
        return scholarReport;
    }


    public String getStudentName(){
        return name;
    }
}
