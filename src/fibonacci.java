import java.util.*;

public class fibonacci {
    public static int fibonacci_numbers(int i){
       if(i == 0 || i == 1){
           return 1;
       } else if(i < 0){
           return -1;
       }else{
          int mul = i * fibonacci_numbers(i - 1);
           return mul;
       }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibonacci_numbers(n));
    }
}
