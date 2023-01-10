package com.bridgelabz.basicprogram;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int  head_coin = 0, tail_coin = 0;
        double head, tail,n ;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no. of times you want to flip the coin:");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            if (random < 0.5) {
                System.out.println("tail");
                tail_coin++;
            } else {
                System.out.println("head");
                head_coin++;
            }
            head = head_coin /  n * 100;
            tail = tail_coin /  n * 100;
            System.out.println("percentage of head:" + head + "%");
            System.out.println("percentage of tail:" + tail + "%");

        }

    }
}
