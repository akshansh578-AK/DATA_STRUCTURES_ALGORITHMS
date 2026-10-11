package Basics;
import java.util.*;
public class PrimeNumber2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int j = 2 ; j*j<=n ; j++){// loop from 2 to root n.
                if(n%j==0){
                    count++;
                    break; // Loop breaks as the count goes 1.
                }
            }
            if(count==0){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }

    }
}
