import java.util.*;

public class pparray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] arr = new int[length];
        System.out.println(arr[arr.length]);
        printpairs(arr);
    }

    public static void printpairs(int[] arr){
        for(int i=0; i < arr.length; i++){
            for(int j =0; j < arr.length; j++){
                System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }
}
