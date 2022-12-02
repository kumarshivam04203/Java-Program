import java.util.*;
public class Palindrome{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number is "+palindrome+"palindrome");
        }else{
            System.out.println("Number is"+palindrome+"not palindrome");
        }
    }
    public static boolean isPalindrome(int Number){
        int palindrome= Number;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;

    }
    if(Number==reverse){
        return true;
    }
    return false;
    }
}