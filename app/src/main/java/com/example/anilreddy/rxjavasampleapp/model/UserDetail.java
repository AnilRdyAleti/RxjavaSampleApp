package com.example.anilreddy.rxjavasampleapp.model;

public class UserDetail {
    public long id;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';

    }
}
