import java.util.*;

public class sod_rec {
    public static int sod_recursion(int i){
        if(i == 0 || i < 0){
            return 0;
        } else{
            return (i%10) + sod_recursion(i/10);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(sod_recursion(n));
    }
}
