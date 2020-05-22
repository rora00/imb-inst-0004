/*
 * CountingCoinsProg.java
 * Author: Luke Dickens
 * Program last changed: 17 September 2019
 */

import java.util.Scanner;

public class CountingHeadsProg {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Indicate how many times to toss the coin:\t");
        int numTosses = keyboard.nextInt();
        // create a variable of type int called headCount and initialise to 0
        int headCount = 0;

        // you must create a new coin object and assign it to a variable
        Coin coin = new Coin();

        // you must now toss the coin numTosses number of times and count 
        // the heads (you should increment headCount each time your coin
        // shows heads
        for (int i = 0; i < numTosses; i++){
            coin.flip();
            if(coin.isHeads() == true){
                headCount++;
            }
        }

        System.out.println(
            "Coin tossed " + numTosses + " times with " + headCount + " heads");
    }
}
