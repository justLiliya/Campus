package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;
import ru.khlebnikova.campus.entity.University;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        University univer = new University();

        student.study();
        teacher.read();
        teacher.teach();
    }
}
