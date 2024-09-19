package Recursion;

import java.util.Scanner;

public class sumOfParametrisedValue {
    public static void sum(int n , int s){
        if (n==0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);// call and work --->both of  work with at a time.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the n :");
        int n = sc.nextInt();
        sum(n,0);


    }
}
