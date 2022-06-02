import java.util.*;

public class substring {

    static boolean substr(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int j;
        for(int i=0; i <= n-m; i++){
            for(j=0; j < m; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
                if(j==m) {
                    return true;
                }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        boolean result = substr(s1,s2);
        if(result){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
