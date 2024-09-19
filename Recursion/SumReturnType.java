package Recursion;

import java.util.Scanner;

public class SumReturnType {
    public static int Sum(int n) {
        if (n==1|| n==0) return n; // base case
        return n + Sum(n-1); // Function call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr n : ");
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
