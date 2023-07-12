package com.booleanuk.core;

public class User {

    private String email;
    private String password;

    private boolean isActivated;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        isActivated = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
