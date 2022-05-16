import java.util.*;

public class takeinput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String s = scn.nextLine();
        System.out.println("Hello " + s);
        System.out.println("Here is the counting: ");
        for(int j=0; j<= n; j++){
            System.out.println(j);
        }
    }
}
