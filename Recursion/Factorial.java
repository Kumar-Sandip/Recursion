package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        if (n==1) return 1; // base case
        return n* Fact(n-1); // fact  call

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the n: ");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
