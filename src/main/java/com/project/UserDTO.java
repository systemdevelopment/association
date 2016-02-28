package com.project;

import java.io.Serializable;


public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userID;
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    

}
