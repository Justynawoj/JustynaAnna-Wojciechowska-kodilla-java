package com.kodilla.testing.forum.statistics;

public class StatisticCounter {
    private int usersNumber;
    private double totalPosts;
    private double totalComments;
    private double postPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.totalPosts = statistics.postsCount();
        this.totalComments = statistics.commentsCount();
        if (usersNumber != 0) {
            this.postPerUser = totalPosts / usersNumber;
        } else {
            this.postPerUser = 0;
        }

        if (usersNumber != 0) {
            this.commentsPerUser = totalComments / usersNumber;
        } else {
            this.commentsPerUser = 0;
        }
        if (totalPosts != 0) {
            this.commentsPerPost = totalComments / totalPosts;
        } else {
            this.commentsPerPost = 0;
        }
    }


    public int getUsersNumber() {
        return usersNumber;
    }

    public double getTotalPosts() {
        return totalPosts;
    }

    public double getTotalComments() {
        return totalComments;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
