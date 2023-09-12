package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;
import ru.khlebnikova.campus.entity.University;
import ru.khlebnikova.campus.util.CampusClient;

public class _Main {

    public static void main(String[] args) {
        University univer = new University("МГУ");
        Teacher teacher = new Teacher(0, "Марлен Витольдович", " учу студентов уму-разуму!", univer);
        Student student = new Student("Переписку Ленина с Каутским", "Феофанов", univer, teacher);
        CampusClient.letsTeach(teacher);
        CampusClient.letsRead(teacher);
        CampusClient.letsRead(student);
        CampusClient.letsStudy(student);
    }
}
