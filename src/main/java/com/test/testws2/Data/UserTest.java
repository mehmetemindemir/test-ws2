package com.test.testws2.Data;

public class UserTest {
    private String userName;
    private String firstName;
    private String lastName;
    private String location;

    public UserTest() {
    }

    public UserTest(String userName, String firstName, String lastName, String location) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
