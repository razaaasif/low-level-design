package com.designpatterns.adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        Student collegeStudent = new CollegeStudent("Aasif","Raza","aasifraza9123@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("Hamid","Raza","aasifraza7654@gmail.com");

        students.add(collegeStudent);
        students.add(new StudentAdapter(schoolStudent.getFirstName() , schoolStudent.getLastName() , schoolStudent.getEmail()));
        return students;
    }
}
