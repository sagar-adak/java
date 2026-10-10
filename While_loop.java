// Write a Java program that prints the numbers only for evn-number using a while loop.

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = sc.nextInt();
        int i = 0;
        while( i <= num ){
            if( i % 2 == 0){
              System.out.println(i);
            }
             i++;
        }

    }
}
