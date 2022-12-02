// public class RevTheArr{
//     public static  void reverse(int numbers[]){
//         int first = 0;
//         int last= numbers.length-1;
//         while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;

//         }
//     }
//     public static void main(String[] args) {
//         int numbers[]={2,3,4,4,3,256};
//         reverse(numbers);
//         for(int i=0; i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }

//         System.out.println();
//     }
// }
// public class RevTheArr{
//     public static void reverse(int numbers[]){
//         int first=0;
//         int last=numbers.length-1;
//         while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;
//         }

//     }
//     public static void main(String[] args) {
//         int numbers[]={1,3,2,4,5,6,3};
//         reverse(numbers);
//         for(int i=0; i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
        
//     }
// }
public class RevTheArr{
    public static void reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,3,6};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
        }
    }
}