// reverse number

import java.util.*;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, sum=0;

        while(num !=0){
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        System.out.println("reverse number : " + sum);
    }
}