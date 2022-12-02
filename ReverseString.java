// reverse a string

import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String rev = "";
        String a = sc.nextLine();
        char ch[] = a.toCharArray();

        for(int i=ch.length-1; i>=0; i--){
            rev = rev + ch[i];
        }
        System.out.println("Reverse String : " + rev);
    }
}