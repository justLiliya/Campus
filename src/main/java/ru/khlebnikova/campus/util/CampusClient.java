package ru.khlebnikova.campus.util;

public class CampusClient {

    public static void letsRead(Readable r){
       r.read();
    }

    public static void letsTeach(Teachable t){
        t.teach();
    }

    public static void letsStudy(Studyble s){
        s.study();
    }

}
