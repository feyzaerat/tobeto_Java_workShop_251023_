package org.example.models;


public class User {
    int userId;
    String userName;
    String userMail;
    String userPhoneNumber;
    String userAddress;

    public User(){}

    public User(int userId, String userName, String userMail, String userPhoneNumber, String userAddress){
        this.userId          = userId;
        this.userName        = userName;
        this.userMail        = userMail;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress     = userAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
