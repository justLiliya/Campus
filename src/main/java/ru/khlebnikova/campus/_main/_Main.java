package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;
import ru.khlebnikova.campus.entity.University;

public class _Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher(0, "Марлен Витольдович");
        University univer = new University("МГУ");
        Student student = new Student("Переписку Ленина с Каутским", "Феофанов");
        student.setUniver(univer);
        student.setTeacher(teacher);
        student.study();
        teacher.teach(" учу студентов уму-разуму!");
        teacher.read();

        System.out.println("---------------------------------------------------------------------");

        Teacher teacher1 = new Teacher(0, "Васисуалий Евдокимович");
        University univer1 = new University("СПБГУ");
        Student student1 = new Student("Разведение шелковичных червей", "Антонов");
        student1.setUniver(univer1);
        student1.setTeacher(teacher1);
        student1.study();
        teacher1.teach(" учу студентов практике выращивания червей");
        teacher1.read();
    }
}
