package com.company;

import java.util.Scanner;

public class Main {
    public static float taximeterCalculator(float km){
        float result;
        if((km*2.2)<= 20)
            result= 20.0F;
        else
            result = (float) (km*2.2);
        return result;
    }

    public static void main(String[] args) {
        float a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Input the distance as a kilometer.");
        a= inp.nextFloat();
        System.out.println("Charged "+taximeterCalculator(a)+" liras.");
    }
}
