package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Teachable;

public class Teacher implements Readable, Teachable {

    private String scholar;
    private String educationalInstitution;
    private String report;
    private int coutnOfsheets;

    public String getScholar() {
        return scholar;
    }

    public Teacher setScholar(String scholar) {
        this.scholar = scholar;
        return this;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public Teacher setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
        return this;
    }

    public String getReport() {
        return report;
    }

    public Teacher setReport(String report) {
        this.report = report;
        return this;
    }

    public int getCoutnOfsheets() {
        return coutnOfsheets;
    }

    public Teacher setCoutnOfsheets(int coutnOfsheets) {
        this.coutnOfsheets = coutnOfsheets;
        return this;
    }

    @Override
    public void read() {
        int coutnOfsheets = (int) (Math.random() * 100);
        if (coutnOfsheets <= 0) {
            coutnOfsheets = 1;
        }
        System.out.println("Прочитал в библиотеке " + coutnOfsheets + " листов новой книги коллеги");

    }

    @Override
    public void teach(String scholar, String report) {
        System.out.println("Студент " + scholar + " принес на проверку работу про " + report + ". Скука смертная!");
    }
}
