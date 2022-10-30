package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi=3.14;
        double r,arc;

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter radius of circle.");
        r= inp.nextDouble();
        System.out.println("Enter the angle do you want.");
        arc= inp.nextDouble();

        System.out.println("Calculated area is "+pi*r*r*arc/360);

    }
}
