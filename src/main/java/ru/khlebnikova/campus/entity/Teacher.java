package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Teachable;

public class Teacher implements Readable, Teachable {

    Student student;
    University univer;
    private int coutnSheets;
    public final String name = "Анатолий Петрович";


    public int getCoutSheets() {
        return coutnSheets;
    }

    public void setCoutSheets(int coutnSheets) {
        this.coutnSheets = coutnSheets;
    }

    public String getTeacherName(){
        return name;
    }

    @Override
    public void read() {
        int coutnOfsheets = (int) (Math.random() * 100);
        if (coutnOfsheets <= 0) {
            setCoutSheets(1);
        }
        System.out.println("Прочитал в библиотеке " + getCoutSheets() + " листов новой книги коллеги");

    }

    @Override
    public void teach() {
        System.out.println("Студент " + student.getStudentName() + " принес на проверку работу про " + student.getScholarReport() + ". Скука смертная!");
    }
}
