import java.util.*;

public class d2b {
    public static int d2b_recursion(int i){
        if(i == 0){
            return 0;
        }
        return (i%2) + (10*d2b_recursion(i/2));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(d2b_recursion(n));
    }
}
