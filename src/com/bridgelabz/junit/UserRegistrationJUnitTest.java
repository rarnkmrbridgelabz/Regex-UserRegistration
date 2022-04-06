package com.bridgelabz.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationJUnitTest {

    @Test
    public void givenAName_WhenCalled_ShouldReturnTrue() {
        UserRegistrationJUnit calculate = new UserRegistrationJUnit();
        assertTrue(calculate.validateName("Arun"));

    }

    @Test
    public void givenValidEmailID_WhenCalled_ShouldReturn() {
        UserRegistrationJUnit calculate = new UserRegistrationJUnit();
        assertTrue(calculate.validateEmail("arun22@gmail.com"));
    }

    @Test
    public void givenValidMobileNumber_WhenCalled_ShouldReturn() {
        UserRegistrationJUnit calculate = new UserRegistrationJUnit();
        assertTrue(calculate.validateMobileNumber("919952525252"));
    }

    @Test
    public void givenValidatePassword_WhenCalled_ShouldReturn() {
        UserRegistrationJUnit calculate = new UserRegistrationJUnit();
        assertTrue(calculate.validatePassword("A*d9aa2e"));
    }
}