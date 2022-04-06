package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC1FirstName {
    static Pattern pattern =Pattern.compile("[A-Z]{1}[a-z]{3,}");

     static void checkPattern(String firstName){
     Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches())
            System.out.println("True");
        else

            System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        checkPattern(firstName);
    }
}



