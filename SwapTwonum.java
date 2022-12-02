// swap two number without two bariable

import java.util.*;
public class SwapTwonum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =10;
        int y= 20;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x =  "+x+" y = "+y);
    }
}