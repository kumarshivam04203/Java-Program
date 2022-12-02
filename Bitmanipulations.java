public class Bitmanipulations{
    //find the number odd or even
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    //get ith bit
    public static int getIthBit(int n, int i){
        int bitMask= 1<<i;
        if( (n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    // set ith bit
    public static int setIthBit(int n, int i) {
        int bitMask =1<<i;
        return n|bitMask;
        
    }
    //clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    //update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        n=clearIthBit(n, i);
        int bitMask=newBit<<i;
        return n | newBit;
    }
    //clear last ith bit
    public static int clearIlastBit(int n, int i){
        int bitMask= ~0<<i;
        return n& bitMask;
    }
    //clear rang i to j
    public static int clearRang(int n, int i, int j){
        int a =(~0<<(j+1));
        int b= (1<<i)-1;
        int bitMask =a/b;
        return n & bitMask;
    }
    // check number of pow 2
    public static boolean isPowertwo(int n){
        return (n & (n-1))==0;
    }
   // public static boolean isPowerOfN(int n){

    }
    // count set bit 
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    
    public static void main(String[] args) {
       // oddOrEven(5);
       // System.out.println(getIthBit(5, 2));
       //System.out.println(setIthBit(5, 2));;
       //System.out.println(clearIthBit(5, 2));
       //System.out.println(updateIthBit(10, 2, 4));
       // System.out.println(clearIlastBit(10, 2));
       //System.out.println(clearRang(10, 2, 4));
      // System.out.println(isPowertwo(64));
       System.out.println(countSetBit(10));
    }
}