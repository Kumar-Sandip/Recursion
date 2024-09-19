package Recursion;

import java.util.Scanner;
public class Print_01_To_N_Decreasing_ord{
    public static void print(int n) {
        if (n == 0)return; //pehale  base case cheack karte hai
        System.out.println(n); // work karte  than
        print(n-1);// call lagate hai

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enetr the n: ");
        int n = sc.nextInt();
       print(n);
    }
}
