// search element in array

import java.util.*;
public class SearchElemInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        int c=0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Search element");
        int search = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                c =c+1;
                break;
            }
        }
        if(c==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}