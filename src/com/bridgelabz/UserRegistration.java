package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    static Pattern pattern =Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
    static void checkPattern(String emailId){
        Matcher matcher =pattern.matcher(emailId);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter e-Mail ID:");
        String emailId = scanner.next();
        checkPattern(emailId);

    }
}
