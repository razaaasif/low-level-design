package com.designpatterns.adapterpattern;

import java.util.StringJoiner;

public class StudentAdapter implements  Student{
    private String firsName;
    private String lastName;
    private String email;

    public StudentAdapter(String firstName, String lastName, String email) {
        this.firsName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public StudentAdapter(){}

    @Override
    public String getFirstName() {
        return this.firsName;
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
        return new StringJoiner(", ", StudentAdapter.class.getSimpleName() + "[", "]")
                .add("firsName='" + firsName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
