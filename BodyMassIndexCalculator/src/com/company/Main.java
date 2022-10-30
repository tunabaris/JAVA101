package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float h,w;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your height as a meter : ");
        h= inp.nextFloat();
        System.out.println("Please enter your mass as a kilogram : ");
        w = inp.nextFloat();

        System.out.println("BMI is "+w/(h*h));
    }
}
