package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    static Pattern pattern =Pattern.compile("^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8,}$");
    static void checkPattern(String password){
        Matcher matcher =pattern.matcher(password);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Password with minimum 8 Characters:");
        String password = scanner.next();
        checkPattern(password);

    }
}
