import java.util.HashSet;

public class Arrays{
    // Brute force approach
    // public static boolean containsDuplicate(int nums[]){
    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int nums[]= {1,2,3,4,1};
    //     System.out.println(containsDuplicate(nums));
       
    // }
     
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int nums[]={1,2,3,4,1};
         System.out.println(containsDuplicate(nums));   
        
    }
}