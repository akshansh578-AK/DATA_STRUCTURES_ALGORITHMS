package Basics;

public class Variables {
    public static void main(String[] args){
        int x = 15;
        int y = 10;
        int sum = x+y;
        System.out.println("Here sum is: "+sum);
        int prd = x*y;
        System.out.println("Here product is: "+prd);

        //Here int is data type x and y are variable name values are
        // which specific variable will hold.

        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        int exp = (x*y)/(x+y);
        System.out.println(exp);
    }
}
