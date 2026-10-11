package Basics;
import java.util.*;
public class Takeinput2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Heyy " +name+ " you have "+n+" cars");

        // first read n as a String using sc.nextLine() and then convert it into an integer using Integer.parseInt().
    }
}
