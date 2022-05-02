package com.example.do_math;

import java.util.Scanner;

public class Random_and_Exercise {

    public static void main(String[] args) {

        System.out.println("| a- b | / (a + b) ^ 3 - c^(1/2)");

        System.out.println("Choose your a value");
        Scanner s = new Scanner(System.in);
        Double a = Double.parseDouble(s.nextLine());

        System.out.println("Choose your b value");
        Scanner s1 = new Scanner(System.in);
        Double b = Double.parseDouble(s1.nextLine());

        System.out.println("Choose your c value");
        Scanner s2 = new Scanner(System.in);
        Double c = Double.parseDouble(s2.nextLine());

        Double answer = ((Math.abs(a-b)) / Math.pow((a+b), 3)) - Math.sqrt(c);
        System.out.println("| "+a+"- "+b+" | / ("+a+" + "+b+") ^ 3 - "+c+"^(1/2) = "+answer);

        System.out.println("Random from 0 to 100 is: "+getRandom(0, 100));



    }
    public static int getRandom(int min, int max){

        int random = (int) (Math.random()*(max-min))+min;
        return random;
    }


}
