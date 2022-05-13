import java.util.*;

public class array {
    public static void fun(int arr[]){
        arr[1] = 20;
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[4] = 50;
        fun(arr);
        for(int val: arr) {
            System.out.println(val);
        }
    }
//     public static void main(String[] args) {
//            System.out.println("*****");
//            System.out.println("   *");
//            System.out.println("  *");
//            System.out.println(" *");
//            System.out.println("*****");
//
//    }
}
