import java.util.*;

public class Fibrec {

    public static int fib_recursion(int i){
        if(i < 0){
            return -1;
        } else if(i == 0 || i ==1){
            return i;
        } else{
            return fib_recursion(i-1) + fib_recursion(i-2);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i < n; i++) {
            System.out.println(fib_recursion(i));
        }

    }
}
