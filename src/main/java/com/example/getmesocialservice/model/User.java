package com.example.getmesocialservice.model;

public class User {
    public String name;
    public String profilePic;
    public String description;

    public User() {
        this.name = "";
        this.profilePic ="";
        this.description="None";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }


    public User(String name, String profilePic, String description) {
        this.name = name;
        this.profilePic = profilePic;
        this.description = description;
    }


}
