import java.util.*;

public class gcd_rec {
    public static int gcd_recursion(int i, int j){
        if(j < 0){
            return -1;
        } else if(j == 0){
            return i;
        }
        return gcd_recursion(j, i%j);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(gcd_recursion(x,n));
    }
}
