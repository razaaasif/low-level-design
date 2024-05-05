package com.designpatterns.adapterpattern;

import java.util.StringJoiner;

public class CollegeStudent implements  Student{
    private String firstName;
    private String lastName;
    private String email;

    public CollegeStudent(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public CollegeStudent(){}
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLast() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CollegeStudent.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
