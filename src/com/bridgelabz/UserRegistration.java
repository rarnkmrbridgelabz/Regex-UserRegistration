package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

    static Pattern pattern =Pattern.compile("[0-9]{2}[0-9]{10}$");
    static void checkPattern(String mobileNo){
        Matcher matcher =pattern.matcher(mobileNo);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Mobile No:");
        String mobileNo = scanner.next();
        checkPattern(mobileNo);

    }
}
