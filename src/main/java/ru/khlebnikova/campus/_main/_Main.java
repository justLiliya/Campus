package ru.khlebnikova.campus._main;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;
import ru.khlebnikova.campus.entity.University;
import ru.khlebnikova.campus.util.CampusProduser;

public class _Main {

    public static void main(String[] args) {
        CampusProduser produser = new CampusProduser();
        Teacher teacher = new Teacher(0, "Марлен Витольдович", " учу студентов уму-разуму!");
        University univer = new University("МГУ");
        Student student = new Student("Переписку Ленина с Каутским", "Феофанов");
        student.setUniver(univer);
        student.setTeacher(teacher);
        produser.startStudentSimulation(student, teacher);

        System.out.println("---------------------------------------------------------------------");

        Teacher teacher1 = new Teacher(0, "Васисуалий Евдокимович", " учу студентов практике выращивания червей");
        University univer1 = new University("СПБГУ");
        Student student1 = new Student("Разведение шелковичных червей", "Антонов");
        student1.setUniver(univer1);
        student1.setTeacher(teacher1);
        produser.startStudentSimulation(student1, teacher1);

    }
}
