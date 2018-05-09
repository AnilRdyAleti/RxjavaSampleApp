package com.example.anilreddy.rxjavasampleapp.utils;

import com.example.anilreddy.rxjavasampleapp.model.ApiUser;
import com.example.anilreddy.rxjavasampleapp.model.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Utils() {

    }

    public static List<User> getUserList() {

        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.firstName = "Anil";
        userOne.lastName = "Reddy";
        userList.add(userOne);

        User userTwo = new User();
        userOne.firstName = "Manish";
        userOne.lastName = "Kumar";
        userList.add(userTwo);

        User userThree = new User();
        userOne.firstName = "Sumit";
        userOne.lastName = "Kumar";
        userList.add(userThree);

        return userList;
    }

    public static List<ApiUser> getApiUserList() {

        List<ApiUser> apiUserList = new ArrayList<>();

        ApiUser apiUserOne = new ApiUser();
        apiUserOne.firstName = "Anil";
        apiUserOne.lastName = "Reddy";
        apiUserList.add(apiUserOne);

        ApiUser apiUserTwo = new ApiUser();
        apiUserTwo.firstName = "Manish";
        apiUserTwo.lastName = "Kumar";
        apiUserList.add(apiUserTwo);

        ApiUser apiUserThree = new ApiUser();
        apiUserThree.firstName = "Sumit";
        apiUserThree.lastName = "Kumar";
        apiUserList.add(apiUserThree);

        return apiUserList;
    }

}
