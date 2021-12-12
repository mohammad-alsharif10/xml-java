package model.user_autherization_model;

public class UsrAuthorizationResponseBodyModel {

    private String userLoggedIn;
    private int userID;

    public String getUserLoggedIn() {
        return userLoggedIn;
    }

    public void setUserLoggedIn(String userLoggedIn) {
        this.userLoggedIn = userLoggedIn;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
