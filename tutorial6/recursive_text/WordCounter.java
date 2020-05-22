//package tutorial6.recursive_text;

import java.util.Scanner;

public class WordCounter {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type in some text, ending with a '.': ");
    int count = countWords(scan);
    System.out.println("You have typed in " + count + " words.");
  }
  
  public static int countWords(Scanner scan) {
    // get next word from scanner
    String nextWord = scan.next(); 
    // base case
    if (nextWord.endsWith("."))
      return 1;
    // standard case
    else
      // number of words is 1 + number of words left to be scanned
      return 1 + countWords(scan);
  }
}
