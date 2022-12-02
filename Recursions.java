public class Recursions{
    public static void arrOfOccurance(int arr[], int key, int i){
       if(i== arr.length){
           return;
        }
         if(arr[i] == key){
            System.out.print(i+" ");

         }
         arrOfOccurance(arr, key, i+1);
        
        
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5,3,4, 6, 2, 7, 2, 2};
        arrOfOccurance(arr, 4, 0);
        System.out.println();
        
    }
}