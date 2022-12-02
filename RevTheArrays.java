public class RevTheArrays{
    public static void reverse(int a[]){
        int fast = 0;
        int last = a.length-1;

        while(fast<last){
            int temp =a[last];
            a[last]=a[fast];
            a[fast]=temp;
            fast++;
            last--;
        }
    }
    public static void main(String[] args) {
        int a[]={3,4,22,4,55,7,9};
        reverse(a);
        for(int i=0; i< a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}