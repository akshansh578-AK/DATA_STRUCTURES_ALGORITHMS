package Basics;
import java.util.*;
public class TakingInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i<n ;i++){
            System.out.println(i);
        }

        // For string
        String name = sc.nextLine();
        System.out.println("Heyy "+name);

        // here we cannot take input of both data type at same time.
    }
}
