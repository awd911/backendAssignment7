package com.example.getmesocialservice.model;

public class userInfo {
    private String userName;
    private String userProfilePic;
    private String userDescription;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfilePic() {
        return userProfilePic;
    }

    public void setUserProfilePic(String userProfilePic) {
        this.userProfilePic = userProfilePic;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }



    public userInfo() {
    }

    public userInfo(String userName, String userProfilePic, String userDescription) {
        this.userName = userName;
        this.userProfilePic = userProfilePic;
        this.userDescription = userDescription;
    }



}
