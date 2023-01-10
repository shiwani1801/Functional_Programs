package com.bridgelabz.functionalprogram;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        //ask user to enter array elements
        System.out.println("Enter array elements :");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        //display array elements
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+ "\n");
            }
            System.out.println();
        }
    }

}