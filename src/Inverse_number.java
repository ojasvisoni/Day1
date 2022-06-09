import java.util.*;

public class Inverse_number {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int inv = 0;
        while(n != 0){
            int a = n % 10;
            count++;
            inv = inv + (count * (int)Math.pow(10, a - 1));
            n = n/10;
        }
        System.out.println(inv);
    }
}
