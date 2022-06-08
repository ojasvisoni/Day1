import java.util.*;

public class prime {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i=0; i < t; i++){
            int n = scn.nextInt();
            int div = 2;
            while(div <= n/2){
                if(n% div == 0){
                    break;
                }
                div++;
            }
            if(div > n/2){
                System.out.println("Prime");
            } else{
                System.out.println("Not Prime");
            }
        }
    }
}
