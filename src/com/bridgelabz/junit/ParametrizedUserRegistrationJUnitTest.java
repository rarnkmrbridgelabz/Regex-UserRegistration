package com.bridgelabz.junit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ParametrizedUserRegistrationJUnitTest {

    private String email;


    public ParametrizedUserRegistrationJUnitTest(String email){
        this.email = email;
    }

    @Parameterized.Parameters
    public static Collection input(){
        System.out.println("Input");
        return Arrays.asList(new Object[][]{{"abc@yahoo.com"}, {"abc-100@yahoo.com"}, {"abc.100@yahoo.com"},
                {"abc111@abc.com"}, {"abc-100@abc.net"}, {"abc.100@abc.com.au"}, {"abc@1.com"},
                {"abc@gmail.com.com"},{"abc+100@gmail.com"}});
    }


    @Test
    public void givenEmail_WhenCorrect_ShouldReturnTrue() {
        System.out.println("Test case Running");
        UserRegistrationJUnit userRegistrationJunit = new UserRegistrationJUnit();
        assertTrue(userRegistrationJunit.validateEmail(email));
    }
}

