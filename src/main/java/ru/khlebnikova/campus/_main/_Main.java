package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;
import ru.khlebnikova.campus.entity.University;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        University univer = new University();
        student.setScolarReport("Переписку Ленина с Каутским");
        student.setName("Феофанов");
        student.setUniver("МГУ");
        student.getStudentName();
        student.getScholarReport();
        student.getUniver();



        //teacher.read();
        //teacher.teach();
        student.study();



    }
}
