package com.company;

public class Student_info {
    String name;
    int Id;
    double Cgpa;
    Student_info(){
        name="Rakib";
        Id=18366841;
        Cgpa=2.83;
    }
    String getName(){
        return name;
    }
    int getId(){
        return Id;
    }
    double getCgpa(){
        return Cgpa;
    }
}
