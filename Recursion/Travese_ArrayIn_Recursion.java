package Recursion;

public class Travese_ArrayIn_Recursion {
    public static void print( int i , int [] arr){
        if (i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
       int  arr[]={ 2,3,5,6,7,8,12,13,14,55,33,22,44,58};
       print(0,arr);

    }
}
