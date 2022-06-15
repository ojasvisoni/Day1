import java.util.*;

public class spofarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] arr = new int[length];
        sumproarr(arr);
    }

    public static void sumproarr(int[] arr){
        int sum = 0;
        int product = 1;

        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }

        for(int i=0; i< arr.length; i++){
            product *= arr[i];
        }

        System.out.println(sum +"," + product);
    }
}
