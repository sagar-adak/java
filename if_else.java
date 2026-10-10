// write a java program if-else condition 

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.println("Enetr you age :");
        Scanner age = new Scanner(System.in);

        int num = age.nextInt();

        if ( num >= 18 ) {
            System.out.print("You are voter");
        }
        else{
            System.out.print("You are not voter");
        }
        
    }
}
