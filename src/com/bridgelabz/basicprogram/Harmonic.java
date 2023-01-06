package com.bridgelabz.basicprogram;;
import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        double result=0;
        double j;
        System.out.println("enter the no.");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        for (j=1;j<=num;j++){
            result=result+ 1/j;
            System.out.println("the value of harmonic no. " + num + "is:"+result);
        }
    }
}
