package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setEducationalInstitution("Универ");
        student.setProfessor("Иванов");
        student.setScholarReport("Переписку Ленина с Каутским");
        student.study();
        Teacher teacher = new Teacher();
        teacher.read();
        teacher.teach("Васяткин", student.getScholarReport());
    }
}
