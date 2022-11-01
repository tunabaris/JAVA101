package com.company;

import java.util.Scanner;

public class Main {

    public static float areaCalculator(float x,float y,float z){
        float u,area;
        u=(x+y+z)/2;
        area= (float) Math.sqrt(u *(u-x)*(u-y)*(u-z));
        return area;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter three values that corresponds 3 edge of triangle. 1st=");
        a= inp.nextFloat();
        System.out.println("2nd=");
        b= inp.nextFloat();
        System.out.println("3rd=");
        c= inp.nextFloat();
        System.out.println("Area of triangle is "+areaCalculator(a,b,c));
    }
}
