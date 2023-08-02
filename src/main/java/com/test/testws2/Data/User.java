package com.test.testws2.Data;

public class User {
    private String userFirstName;
    private String userLastName;
    private String userName;
    private int userId;

    public User() {
    }



    public User(String userFirstName, String userLastName, String userName, int userId) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userName = userName;
        this.userId = userId;
    }


    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "user ID: "+userId+" userFirstName:"+userFirstName+" userLastName:"+userLastName;
    }
}
