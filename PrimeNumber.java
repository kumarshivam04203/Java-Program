// prime number nikalna

import java.util.*;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int c = 0;
        for(int i=2; i<=a/2; i++){
            if(a%i == 0){
                c = c+1;
                break;
            }
        }
        if(c == 1){
            System.out.println("not prime number");
        }else{
            System.out.println("prime number");
        }
    }
}