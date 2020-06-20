package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUsers = new ArrayList<>();

        public Forum() {

            forumUsers.add(new ForumUser(1, "Ricci Capricci", 'F', 1997, 11, 27, 1));
            forumUsers.add(new ForumUser(2, "Apollo17", 'M', 1958, 2, 22, 0));
            forumUsers.add(new ForumUser(3, "Churchill", 'M', 1960, 6, 21, 10));
            forumUsers.add(new ForumUser(4, "Leichttraktor", 'M', 1980, 9, 11, 100));
            forumUsers.add(new ForumUser(5, "Matilda IV", 'F', 1988, 6, 7, 400));
            forumUsers.add(new ForumUser(6, "Lilith", 'F', 1970, 3, 7, 10));
            forumUsers.add(new ForumUser(7, "Schwarzpanzer58", 'M', 1931, 6, 13, 30));
            forumUsers.add(new ForumUser(8, "KV128", 'M', 1977, 7, 8, 0));
        }

        public List<ForumUser> getUsersList(){
        return new ArrayList<>(forumUsers);
    }
}
