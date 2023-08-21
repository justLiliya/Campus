package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Teachable;

public class Teacher implements Readable, Teachable {

    private Student student;
    private University univer;
    private int countSheets;
    private String name;

    public Teacher(int countSheets, String name) {
        this.student = student;
        this.univer = univer;
        this.countSheets = countSheets;
        this.name = name;
    }

    public int getCoutSheets() {
        return countSheets;
    }

    public void setStudent(String stu) {
        student.setName(stu);
    }

    public String getStudent() {
        return student.getStudentName();
    }

    public void setUniver(String un) {
        univer.setUniverName(un);
    }

    public String getUniver() {
        return univer.getUniverName();
    }

    public int getCountSheets() {
        return countSheets;
    }

    public void setCountSheets(int countSheets) {
        this.countSheets = countSheets;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public void read() {
        int countSheets = (int) (Math.random() * 100);
        if (countSheets <= 0) {
            countSheets = 1;
        }
        System.out.println("Прочитал в библиотеке " + countSheets + " листов новой книги коллеги");

    }

    @Override
    public void teach(String speak) {
        System.out.println("Я " + name + speak);
    }
}
