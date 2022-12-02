//count vowel and consonant

import java.util.*;
public class CountVowelandConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char ch[] = str.toCharArray();
        int vowel = 0, cons =0;

        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a' || ch[i]== 'e' || ch[i]=='i' || ch[i]=='o' || ch[i] == 'u'){
                vowel = vowel +1;
            }else{
                cons = cons + 1;
            }
        }
        System.out.println("total vowel : " +vowel+ " total consonant "+cons);
    }
}