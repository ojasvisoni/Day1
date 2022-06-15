import java.util.*;

public class pparray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<length; i++ ) {
            arr[i] = scn.nextInt();
        }
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
