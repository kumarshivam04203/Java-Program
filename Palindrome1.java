//find palindrome or note...

import java.util.*;
public class Palindrome1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =454, temp, r;
        int sum = 0;

        temp = n;
        while(n != 0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(sum == temp){
            System.out.println(" Palindrome Number");
        }else{
            System.out.println("Not palindrome number");
        }
    }
}