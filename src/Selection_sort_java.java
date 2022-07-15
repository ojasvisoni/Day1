import java.util.*;

public class Selection_sort_java {
    public static class SelectionSort {
        static void selectionSort(int[] arr) {
            for (int j = 0; j < arr.length - 1; j++) {
                int minIndex = j;
                for (int i = j + 1; i < arr.length; i++) {
                    if (arr[i] < arr[minIndex]) {
                        minIndex = i;
                    }
                }
                if(minIndex != j){
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 3, 2, 5, 8, 4, 1, 9};
        SelectionSort.printArray(arr);
        SelectionSort.selectionSort(arr);
        SelectionSort.printArray(arr);
    }
}


