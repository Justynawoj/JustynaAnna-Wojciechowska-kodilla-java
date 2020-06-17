package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticCounter {
    private int usersNumber;
    private int totalPosts;
    private int totalComments;
    private double usersAveragePostsQuantity;
    private double usersAverageCommentsQuantity;
    private double postsAverageCommentsQuantity;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersNumber = statistics.usersNames().size();
        this.totalPosts = statistics.postsCount();
        this.totalComments = statistics.commentsCount();
        if(totalPosts != 0) {
            this.usersAveragePostsQuantity = usersNumber / totalPosts;
        }
        if (totalComments != 0) {
            this.usersAverageCommentsQuantity = usersNumber / totalComments;
            this.postsAverageCommentsQuantity = totalPosts / totalComments;
           }
        }


    public String showStatistics(){
        return "usersNumber "+usersNumber+"; totalComments "+ totalComments+", totalPosts "+totalPosts+ " usersAveragePostsQuantity "+usersAveragePostsQuantity+ ", usersAverageCommentsQuantity "+usersAverageCommentsQuantity+", postsAverageCommentsQuantity "+postsAverageCommentsQuantity;
    }

    public int getUsersNumber() {
        return usersNumber;
    }
}
