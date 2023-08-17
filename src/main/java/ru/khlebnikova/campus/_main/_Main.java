package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setEducationalInstitution("Универ");
        student.setProfessor("Иванов");
        student.study();
    }
}
