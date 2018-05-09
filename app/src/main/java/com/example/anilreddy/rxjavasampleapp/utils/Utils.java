package com.example.anilreddy.rxjavasampleapp.utils;

import android.util.Log;

import com.androidnetworking.error.ANError;
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

    public static List<User> convertApiUserListToUserList(List<ApiUser> apiUserList) {
        List<User> userList = new ArrayList<>();

        for (ApiUser apiUser : apiUserList) {
            User user = new User();
            user.firstName = apiUser.firstName;
            user.lastName = apiUser.lastName;
            userList.add(user);
        }

        return userList;
    }

    public static List<User> getUserListWhoLovesCricket() {
        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.firstName = "Anil";
        userOne.lastName = "Reddy";
        userList.add(userOne);

        User userTwo = new User();
        userOne.firstName = "Manish";
        userOne.lastName = "Kumar";
        userList.add(userTwo);

        return userList;
    }

    public static List<User> getUserListWhoLovesFootball() {
        List<User> userList = new ArrayList<>();

        User userOne = new User();
        userOne.firstName = "Anil";
        userOne.lastName = "Reddy";
        userList.add(userOne);

        User userTwo = new User();
        userOne.firstName = "Sumit";
        userOne.lastName = "Kumar";
        userList.add(userTwo);

        return userList;
    }

    public static List<User> filterUserWhoLovesBoth(List<User> cricketFans, List<User> footballFans) {
        List<User> userWhoLovesBoth = new ArrayList<User>();

        for (User cricketFan : cricketFans) {
            for (User footballFan : footballFans) {
                if (cricketFan.id == footballFan.id) {
                    userWhoLovesBoth.add(cricketFan);
                }
            }
        }
        return userWhoLovesBoth;
    }

    public static void logError(String TAG, Throwable e) {
        if (e instanceof ANError) {
            ANError anError = (ANError) e;
            if (anError.getErrorCode() != 0) {
                Log.d(TAG, "onError errorCode : " + anError.getErrorCode());
                Log.d(TAG, "onError errorBody : " + anError.getErrorBody());
                Log.d(TAG, "onError errorDetail : " + anError.getErrorDetail());
            } else {
                Log.d(TAG, "onError errorDetail : " + anError.getErrorDetail());
            }
        } else {
            Log.d(TAG, "onError errorMessage: " + e.getMessage());
        }
    }

}
