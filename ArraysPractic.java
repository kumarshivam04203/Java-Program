public class ArraysPractic{
    public static int getMinMax(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void revArrays(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    
    public static void main(String[] args) {
        int numbers[]={5,4,66,65,478,1,8888};
       // System.out.println(getMinMax(numbers));
       /* 
       revArrays(numbers);
       for(int i=0; i<numbers.length; i++){

        System.out.print(numbers[i]+ " ");
       }
       System.out.println();
       */
    }
}