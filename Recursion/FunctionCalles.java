package Recursion;

public class FunctionCalles {
    public static void Mango(){

        System.out.println(" Hi I am in Mango");
    }
    public static void banana(){
        System.out.println("hi I am in banana");
        Mango();


    }
    public static void Apple() {
        System.out.println("Hi I am in Apple");
        banana();

    }
    public static void main(String[] args) {
        System.out.println(" Hi I am in Main");
        Apple();

    }
}
