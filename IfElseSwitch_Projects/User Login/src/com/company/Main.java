package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,password;
        Scanner inp= new Scanner(System.in);
        System.out.print("Please enter your username: ");
        userName= inp.nextLine();

        System.out.print("Please enter your password: ");
        password= inp.nextLine();

        if(userName.equals("Java") && password.equals("java1234"))
            System.out.println("Entered successfully.");
        else
            System.out.println("User name or password is incorrect. Please try again.");

    }
}
