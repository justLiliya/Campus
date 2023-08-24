package ru.khlebnikova.campus.util;

import ru.khlebnikova.campus.entity.Student;
import ru.khlebnikova.campus.entity.Teacher;

public class CampusProduser {

    public void startStudentSimulation(Student student, Teacher teacher) {
        int count = 0;
        while (count < 3) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber <= 40) {
                student.study();
                student.read();
            } else if (eventNumber > 40 && eventNumber <=80) {
                teacher.read();
                teacher.teach();
            }else if(eventNumber > 80 && eventNumber < 100){
                System.out.println("Я устал, я мухожук!");
            }
            count++;
        }
    }
}
