package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idNumber;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(int idNumber, String userName, char sex,int yearOfBirth, int monthOfBirth, int dayOfBirth , int postsQuantity) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser:" +
                "userName - " + userName + '\'' +
                ", sex - " + sex +
                ", dateOfBirth - " + dateOfBirth +
                ", postsQuantity - " + postsQuantity;


    }
}
