package com.bramantio.ubay.webapp.dto;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class UserDTO {

    private String userName;
    private String userEmail;
    private String userPhone;

    public UserDTO(){};

    public UserDTO(String userName, String userEmail, String userPhone) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}
