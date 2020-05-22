//package tutorial6.recursive_numbers;

import java.util.Scanner;

public class FactorialCalculator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Type in an integer: ");
    int number = scan.nextInt();
    long result = fact(number);
    System.out.println(number + "! == " + result);
  }
  
  public static long fact(int n) {
    // base case
    if (n == 0)
      return 1l;
    // standard case
    else
      return n * fact(n - 1);
  }
}
