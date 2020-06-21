package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer,ForumUser> filteredUsers = forum.getUsersList().stream()
                .filter(user -> user.getSex()=='M')
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getPostsQuantity()>0)
                .collect(Collectors.toMap(forumUser -> forumUser.getIdNumber(),user ->user));

        filteredUsers.entrySet().stream()
                .map(entry -> entry.getKey() +" "+ entry.getValue())
                .forEach(System.out::println);

    }
}