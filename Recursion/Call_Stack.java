package Recursion;

public class Call_Stack {
    public static void Pip (int n) {
        if (n == 0) return;
        System.out.println(" pre " + n);// pre mean before
        Pip(n-1);
        System.out.println(" in " + n);// in mean mid
        Pip(n-1);
        System.out.println(" post " + n);// post mean After

    }
    public static void main(String[] args) {

        Pip(3);
    }
}
