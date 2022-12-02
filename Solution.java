import java.util.*;
public class Solution{
    public static void main(String[] args) {
        String s="";
        String print="";
        for(int i=0; i<=s.length()-1;i++){
            print =print + s.charAt(i);
            System.out.println(print);   
        }
        for(int i=s.length()-1; i>=0;i--){
            print =s.substring(0,i);
            System.out.println(print);   
        }    
        }
       
    
    
   }

