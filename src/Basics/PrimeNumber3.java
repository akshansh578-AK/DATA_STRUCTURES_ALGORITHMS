package Basics;
import java.util.*;
// We have to find prime number within range
public class PrimeNumber3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low ; i<=high ; i++){
            int count = 0;
            for(int j = 2 ; j*j<=i ; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("The number is Prime "+i);
            }
            else{
                System.out.println("The number is not prime "+i);
            }
        }
    }
}
