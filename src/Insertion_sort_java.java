import java.util.*;

public class Insertion_sort_java {
    public static class InsertionSort{
        static void insertionSort(int[] arr){
            for(int i=0; i< arr.length-1; i++){
              int temp = arr[i];
              int j = i;
              while(j>0 && arr[j-1]> temp){
                 arr[j] = arr[j-1];
                 j--;
              }
              arr[j] = temp;
            }
        }



        static void printArray(int[] arr){
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr = {6,3,9,1,2,0,7,8};
        InsertionSort.printArray(arr);
        InsertionSort.insertionSort(arr);
        InsertionSort.printArray(arr);
    }
}
