package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {

    String username;
    int updateCount;

    public ForumUser(String username) {
        username = username;
    }

    @Override
    public void updade(ForumTopic forumTopic) {
        System.out.println(username+ ": New messages in topic "+ forumTopic.getName()
        + "\n" + " (total: "+forumTopic.getMessages().size() + " messages");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
