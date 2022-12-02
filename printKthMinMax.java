// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;

// public class printKthMinMax{
//     public static void kthSmallest(Integer a[], int k){  
//         Arrays.sort(a);
//         System.out.println(a[k++]);
//     }
//     public static void kthLargest(Integer a[], int l){
//         Arrays.sort(a, Collections.reverseOrder());
//         System.out.println(a[l++]);
//     }
//      public static void main(String[] args) {
//         Integer a[]={3,1,32,22,33,43,45};
//         kthSmallest(a, 1);
//         kthLargest(a, 1);

//      }
// }
import java.lang.reflect.Array;
import java.util.*;
public class printKthMinMax{
    public static void isSmallest(Integer a[], int k){
        Arrays.sort(a);
        System.out.println(a[k++]);
    }
    public static void isLargest(Integer a[], int l){
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[l++]);
    }
    public static void main(String[] args) {
        Integer a[]={7,2,3,5,1,8};
        isLargest(a, 2);
        isSmallest(a, 2);

    }
}