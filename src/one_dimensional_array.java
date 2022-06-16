import java.util.*;
public class one_dimensional_array {
    int[] arr = null;
    public one_dimensional_array(int sizeofarray){
        arr = new int[sizeofarray];
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valuetobeinserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valuetobeinserted;
                System.out.println("Successfully Inserted");
            } else{
                System.out.println("This cell is already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

}
