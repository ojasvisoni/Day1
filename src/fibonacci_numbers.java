import java.util.*;

public class fibonacci_numbers {
    public static void main(String[] args){
        int a =0;
        int b = 1;
        int c;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=a; i < n; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
