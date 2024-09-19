package Recursion;

import java.util.Scanner;

public class print_IncreasingAfter_Call {
    public static void print(int n) {
        if (n == 0)return; //pehale  base case cheack karte hai
        print(n-1);// call lagate hai
        System.out.println(n); // work karte  than


    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enetr the n: ");
        int n = sc.nextInt();
        print(n);
    }
}
