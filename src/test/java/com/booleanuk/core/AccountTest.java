package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {


    AccountManager accountManager;

    @BeforeEach
    public void preapareForTests(){
        accountManager = new AccountManager();
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsLessThan8Characters(){
        //given
        String password = "Aaaaaaa";
        String email = "email@email.cm";

        //when
        boolean isCreated = accountManager.createAccount(email,password);

        //then
        assertFalse(isCreated);

    }
    @Test
    public void shouldReturnTrueWhenPasswordIsEqualsOrMoreThan8Characters(){
        //given
        String password = "Aaaaaaaa";
        String email = "email@email.cm";

        //when
        boolean isCreated = accountManager.createAccount(email,password);

        //then
        assertTrue(isCreated);

    }
    @Test
    public void shouldReturnTrueIfEmailDoesNotContainsAt(){
        //given
        String password = "Aaaaaaaa";
        String email = "email@email.cm";
        //when
        boolean isCreated = accountManager.createAccount(email,password);
        //then
        assertTrue(isCreated);
    }

    @Test
    public void shouldReturnFalseIfEmailDoesNotContainsAt(){
        //given
        String password = "Aaaaaaaa";
        String email = "emailemail.cm";
        //when
        boolean isCreated = accountManager.createAccount(email,password);
        //then
        assertFalse(isCreated);
    }





}
