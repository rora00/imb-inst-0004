// CoinProg.java
// Author: Rob Miller
// Program last changed: 19 September 2008
    
/* This program tests the Coin class.             */ 

import java.util.Scanner;

public class CoinProg {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Coin theCoin = new Coin();

        char selection = 'a';
        while (selection != 'q') {
            System.out.println();
            System.out.println("\tType: ");
            System.out.println("\t\tf - to flip the coin");
            System.out.println("\t\tq - to quit\n");
            System.out.print("\tEnter selection: ");
            selection = keyboard.next().charAt(0);
            if (selection == 'f') {
                theCoin.flip();
                System.out.println("\tThe result was " + theCoin);
            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }
}
