package ru.khlebnikova.campus.entity;

public class University {

    private Teacher teacher;
    private Student student;
    public String univerName;

    public University(String univerName) {
        this.univerName = univerName;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }
    public Teacher getTeacher() {
        return this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(String stu) {
        student.setName(stu);
    }

    public Student getStudent() {
        return this.student = student;
    }

}
