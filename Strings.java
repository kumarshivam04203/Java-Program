// import java.util.*;
// public class Strings{
//     public static String compress(String str){
//        // String newStr ="";
//         StringBuilder sb= new StringBuilder("");
//         for(int i=0; i<str.length(); i++){
//             Integer count=1;
//             while(i<str.length()-1 && str.charAt(i) ==str.charAt(i+1)){
//                 count++;
//                 i++;

//             }
//             //newStr += str.charAt(i);
//             sb.append(str.charAt(i));
//             if(count>1){
//                 //newStr += count.toString();
//                 sb.append(count.toString());
            
//             }
//         }
//         return sb.toString();

//     }
//     public static void main(String[] args) {
//        // String str= "aaaacbaadccc";
//        // System.out.println(compress(str));
//        System.out.println(6>>3);
//     }
// }

public class Strings{
    public static int fact(int n){
        if(n== 1){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n + fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n= 55;
        System.out.println(fact(n));
        
        
    }
}
/* 
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		
		

		int sum = 0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
       
		sum += i;
		// Print the sum
		System.out.print(sum);
		s.close();
	}

}
*/