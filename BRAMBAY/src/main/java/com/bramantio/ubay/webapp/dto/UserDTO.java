package com.bramantio.ubay.webapp.dto;

/**
 * Hi!
 * Created by captain_n3mo on 23/04/2017.
 */
public class UserDTO {

    private String userName;
    private String userEmail;
    private int userPhone;

    public UserDTO(String userName, String userEmail, int userPhone) {
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

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

}
