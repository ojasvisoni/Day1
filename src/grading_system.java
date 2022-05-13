import java.util.*;

public class grading_system {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int answer = decimal(n,b);
        System.out.println(answer);
    }
    public static int decimal(int n, int b){
        int a = 0;
        int c = 0;
        int sum = 0;
        while (n != 0) {
            a = n % 10;
            n = n / 10;
            sum += (a*Math.pow(b,c));
            c++;
        }
        return sum;
    }
}
