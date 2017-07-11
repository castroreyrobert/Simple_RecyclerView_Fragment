package com.example.fragmentrecyclerviewmvpdemo;

/**
 * Created by castroreyrobert on 7/11/17.
 */

public class Person {
    public String mFirstName;
    public String mLastName;
    public int mAge;

    public Person(String firstName, String lastName, int age) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public int getAge() {
        return mAge;
    }
}
