package Recursion;

import java.util.Scanner;

public class Print_01_To_N_Increasing_ord {
//    static int n; <-- First method
    public static void print(int x , int n) { // Second method using Extra parameter
        if (x>n)return; // base case
        System.out.println(x);// work
        print(x+1 , n);// call function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
       int  n = sc.nextInt();
        print(1,n);

    }
}
