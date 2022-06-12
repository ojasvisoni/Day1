import java.util.*;

public class power {
    public static int power_rec(int i, int j){
        if(j < 0){
            return -1;
        } else if(j == 0){
            return 1;
        }
        return i * power_rec(i, j-1);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power_rec(x,n));
    }
}
