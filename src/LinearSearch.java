import java.util.*;

public class LinearSearch {
    public static int LinearSarching(int[] arr, int value){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == value){
                System.out.println("Value is found at index " + i);
                return i;
            }
        }
        System.out.println("Value " + value + " is not found in this array");
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 6, 1, 0, 7, 8, 3, 9};
        int value = 7;
        LinearSearch.LinearSarching(arr, value);
    }
}


