public class NegOneSide{
    public static void rearrang(int []a){
        int t[]=new int [a.length];
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>=0)
            t[j++]=a[i];
            if(j==a.length || j==0)
            return;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]<0)
            t[j++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            a[i]=t[i];
        }
    }
    public static void main(String[] args) {
        int a[]= {1,-3,2,3,4,-5,9,-33};
        rearrang(a);
        for (int i=0; i<a.length;i++)
        System.out.print(a[i]);
    }
}