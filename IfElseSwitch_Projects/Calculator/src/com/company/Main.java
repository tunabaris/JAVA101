package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
	    float num1,num2;
        int choose;
        String op;
        System.out.print("Please enter first number:");
        num1= inp.nextFloat();
        System.out.print("Please enter second number:");
        num2= inp.nextFloat();
        System.out.println("Choose the number corresponds the operation that you want.\n" +
                "1) +\n" +
                "2) -\n" +
                "3) * \n" +
                "4) / ");

        choose= inp.nextInt();
        switch(choose){
            case 1:
                System.out.println(num1+"+"+num2+" is equal to "+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"-"+num2+" is equal to "+(num1-num2));
                break;
            case 3:
                System.out.println(num1+"*"+num2+" is equal to "+(num1*num2));
                break;
            case 4:
                System.out.println(num1+"/"+num2+" is equal to "+(num1/num2));
                break;
            default:
                System.out.println("Enter a valid number.");
                break;
        }

    }
}
