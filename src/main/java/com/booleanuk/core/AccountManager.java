package com.booleanuk.core;

public class AccountManager {




    public boolean createAccount(String email, String password){

        boolean correctEmail = false;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                correctEmail = true;
            }
        }
        if(password.length() < 8 || !correctEmail){
            return false;
        }


        return true;
    }
}
