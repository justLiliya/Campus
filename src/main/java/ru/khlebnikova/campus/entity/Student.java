package ru.khlebnikova.campus.entity;

import ru.khlebnikova.campus.util.Readable;
import ru.khlebnikova.campus.util.Studyble;

public class Student implements Studyble, Readable {

    private String professor;
    private String educationalInstitution;

    @Override
    public void study(){
        read();
        System.out.println("Сдал доклад по теме профессору "+ getProfessor() + "у!");
    }

    @Override
    public void read(){
        getEducationalInstitution();
        System.out.println("Читал переписку Ленина с Каутским в библиотеке " + educationalInstitution + "a Долго думал.");
    }

    public String getProfessor() {
        return professor;
    }

    public Student setProfessor(String professor) {
        this.professor = professor;
        return this;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public Student setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
        return this;
    }
}
