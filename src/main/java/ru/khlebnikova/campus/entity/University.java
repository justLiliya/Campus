package ru.khlebnikova.campus.entity;

public class University {

    private Teacher teacher;
    private Student student;
    public String univerName;


    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }
}
