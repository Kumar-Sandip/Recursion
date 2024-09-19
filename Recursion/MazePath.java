package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int Mazepath(int row ,int col,int m, int n){
        if (row==m || col==n)return 1;
        int rightways = Mazepath(row,col+1,m,n);
        int downways = Mazepath(row+1,col,m,n);
        return rightways + downways;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enetr  n :");
        int n = sc.nextInt();
        System.out.print(" Enter  m :");
        int m = sc.nextInt();
        System.out.println(Mazepath(1,1,m,n));
    }

}

