package Recursion;

import java.util.Scanner;

public class Nth_StairPath {
    public static int Nthstair(int n) {
        if (n<=2) return n;
        return Nthstair(n-1) + Nthstair(n-2);

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enetr the n: ");
        int n = sc.nextInt();
        System.out.println(Nthstair(n));
    }


}
