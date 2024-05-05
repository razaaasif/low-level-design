package com.designpatterns.adapterpattern;

public class AdapterDemo {

    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        System.out.println(studentClient.getStudents());
    }
}
