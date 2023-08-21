package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Teachable;

public class Teacher implements Readable, Teachable {

    private Student student;
    private University univer;
    private int countSheets;
    private String name;

    public int getCoutSheets() {
        return countSheets;
    }

    public Teacher setStudent(Student student) {
        this.student = student;
        return this;
    }

    public Teacher setUniver(University univer) {
        this.univer = univer;
        return this;
    }

    public Student getStudent() {
        return student;
    }

    public University getUniver() {
        return univer;
    }

    public int getCountSheets() {
        return countSheets;
    }

    public Teacher setCountSheets(int countSheets) {
        this.countSheets = countSheets;
        return this;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getName(){
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
    public void teach() {
        System.out.println("Студент " + student.getStudentName() + " принес на проверку работу про " + student.getScholarReport() + ". Скука смертная!");
    }
}
