package Recursion;

import java.util.Scanner;

public class CalculatePow_a_and_b {
    public static int  Pow(int a ,int b) {
        if (b==0)return 1;
        return a * Pow(a,b-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enetr the Base : ");
        int a = sc.nextInt();
        System.out.print("Enter the Power : ");
        int b = sc.nextInt();
        System.out.println(a + " Raised to the power of " + b + " is "  + Pow(a,b));
    }
}
