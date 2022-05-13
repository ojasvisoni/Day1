import java.util.*;

public class swap {

    public static void fun(int a, int b){
        int temp = a;
        a = b;
        a = temp;
    }

    static int a = 10;
    static int b = 20;

    public static void main(String[] args){
        fun(a,b);
        System.out.println(a + " " + b);
    }
}
