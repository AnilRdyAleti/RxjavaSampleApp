package com.example.anilreddy.rxjavasampleapp.utils;

import com.example.anilreddy.rxjavasampleapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Utils() {

    }

    public static List<User> getUserList() {

        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.firstName = "";
        userOne.lastName = "";
        userList.add(userOne);

        User userTwo = new User();
        userOne.firstName = "";
        userOne.lastName = "";
        userList.add(userTwo);

        User userThree = new User();
        userOne.firstName = "";
        userOne.lastName = "";
        userList.add(userThree);

        return userList;
    }

}
