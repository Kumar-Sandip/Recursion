package Recursion;

public class SkipCharacter_in_usingRecursion {
    public  static void print (int i ,String s, String ans){
        if (i==s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i)!='a') ans += s.charAt(i);
        print(i+1,s,ans);

    }
    public static void main(String[] args) {
        String  s = " Sandip Kumar";
        print (0,s," ");
    }
}
