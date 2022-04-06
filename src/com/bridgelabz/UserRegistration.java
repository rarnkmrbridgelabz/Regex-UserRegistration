package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    static void checkPattern1(String firstName){
        Pattern pattern =Pattern.compile("[A-Z]{1}[a-z]{3,}");
    Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}


    static void checkPattern2(String lastName){
     Pattern pattern =Pattern.compile("[A-Z]{1}[a-z]{3,}");
     Matcher matcher =pattern.matcher(lastName);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern3(String emailId){
    Pattern pattern =Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");

        Matcher matcher =pattern.matcher(emailId);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern4(String mobileNo){
    Pattern pattern =Pattern.compile("[0-9]{2}[0-9]{10}$");
    Matcher matcher =pattern.matcher(mobileNo);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern5(String password1){
    Pattern pattern =Pattern.compile("^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8,}$");
    Matcher matcher =pattern.matcher(password1);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern6(String password2){
 Pattern pattern =Pattern.compile("^(?=.*[A-Z])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$");
    Matcher matcher =pattern.matcher(password2);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern7(String password3){
    Pattern pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$");
    Matcher matcher =pattern.matcher(password3);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    static void checkPattern8(String password4){
 Pattern pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$");
    Matcher matcher =pattern.matcher(password4);
        if (matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        checkPattern1(firstName);

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        checkPattern2(lastName);

        System.out.println("Enter e-Mail ID:");
        String emailId = scanner.next();
        checkPattern3(emailId);

        System.out.println("Enter Mobile No:");
        String mobileNo = scanner.next();
        checkPattern4(mobileNo);

        System.out.println("Enter Password with minimum 8 Characters:");
        String password1 = scanner.next();
        checkPattern5(password1);

        System.out.println("Enter Password with atleast One Upper Case:");
        String password2 = scanner.next();
        checkPattern6(password2);

        System.out.println("Enter Password with Atleast One Number:");
        String password3 = scanner.next();
        checkPattern7(password3);

        System.out.println("Enter Password with Atleast One Special Character:");
        String password4 = scanner.next();
        checkPattern8(password4);



        System.out.println("----------Valid Emails from Sample-------------");

        emailId = "abc@yahoo.com";
        checkPattern3(emailId);

        emailId = "abc-100@yahoo.com";
        checkPattern3(emailId);

        emailId = "abc.100@yahoo.com";
        checkPattern3(emailId);

        emailId = "abc111@abc.com";
        checkPattern3(emailId);

        emailId = "abc-100@abc.net";
        checkPattern3(emailId);

        emailId = "abc.100@abc.com.au";
        checkPattern3(emailId);

        emailId = "abc@1.com";
        checkPattern3(emailId);

        emailId = "abc@gmail.com.com";
        checkPattern3(emailId);

        emailId = "abc+100@gmail.com";
        checkPattern3(emailId);

        System.out.println("----------Invalid Emails from Sample-------------");

        emailId = "abc";
        checkPattern3(emailId);

        emailId = "abc@.com.my";
        checkPattern3(emailId);

        emailId = "abc123@gmail.a";
        checkPattern3(emailId);

        emailId = "abc123@.com";
        checkPattern3(emailId);

        emailId = "abc123@.com.com";
        checkPattern3(emailId);

        emailId = ".abc@abc.com";
        checkPattern3(emailId);

        emailId = "abc()*@gmail.com";
        checkPattern3(emailId);

        emailId = "abc@%*.com";
        checkPattern3(emailId);

        emailId = "abc..2002@gmail.com";
        checkPattern3(emailId);

        emailId = "abc.@gmail.com";
        checkPattern3(emailId);

        emailId = "abc@abc@gmail.com";
        checkPattern3(emailId);

        emailId = "abc@gmail.com.1a";
        checkPattern3(emailId);

        emailId = "abc@gmail.com.aa.au";
        checkPattern3(emailId);

    }
}
