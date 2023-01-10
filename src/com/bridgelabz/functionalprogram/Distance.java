package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x value=");
        int x= scan.nextInt();
        System.out.println("enter y value=");
        int y= scan.nextInt();

        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("distance from (" + x+ "," + y + ")to (0,0)=" + dist);
    }
}
