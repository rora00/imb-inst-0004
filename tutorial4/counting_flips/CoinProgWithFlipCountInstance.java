// Author: Martin O'Reilly (based on original by Rob Miller)
// Program last changed: 7 October 2013

package tutorial4.counting_flips;

/* 
  This program tests the Coin class enhanced with an instance flip counter for
  each coin */ 

import java.util.Scanner;

public class CoinProgWithFlipCountInstance {

  public static void main(String[] args) {

    System.out.println("\tPROGRAM STARTED");
    Scanner scan = new Scanner(System.in);
    Coin firstCoin = new Coin();
    Coin secondCoin = new Coin();
    System.out.println("\tCOINS CREATED");
    printCoinStatus(firstCoin, secondCoin);

    char selection = 'a';
    while (selection != 'q') {
      System.out.println();
      System.out.println("\tType: ");
      System.out.println("\t\tf - to flip only the first coin");
      System.out.println("\t\ts - to flip only the second coin");
      System.out.println("\t\tb - to flip both coins at once");
      System.out.println("\t\tq - to quit\n");
      System.out.print("\tEnter selection: ");
      selection = scan.next().charAt(0);
      if (selection == 'f') {
        firstCoin.flip();
				printCoinStatus(firstCoin, secondCoin);
      }  
      else if (selection == 's') {
        secondCoin.flip();
				printCoinStatus(firstCoin, secondCoin);
      }  
      else if (selection == 'b') {
        firstCoin.flip();
        secondCoin.flip();
				printCoinStatus(firstCoin, secondCoin);
      }  
    }
    printCoinStatus(firstCoin, secondCoin);
    System.out.println("\tPROGRAM ENDED");
  }
  
  // Helper method to print coin status (not part of main method)
  // Must be static as is is called from main method, which is static
  public static void printCoinStatus(Coin coin1, Coin coin2) {

  	System.out.println("\n\tSTATUS: first coin " 
  			+ coin1.totalNumberOfFlipsForThisCoin() + " flips; second coin " 
  			+ coin2.totalNumberOfFlipsForThisCoin() + " flips:");
		System.out.println("\tFirst coin: " + coin1
			+ ", second coin: " + coin2 + ".");
  }
}
