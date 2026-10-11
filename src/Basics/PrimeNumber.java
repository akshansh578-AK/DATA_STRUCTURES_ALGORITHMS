package Basics;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ; i<t ; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int j = 1 ; j<=n ; j++){
                if(n%j==0){
                    count++;
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
