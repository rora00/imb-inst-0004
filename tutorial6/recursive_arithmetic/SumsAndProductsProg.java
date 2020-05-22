package tutorial6.recursive_arithmetic;

import java.util.Scanner;

public class SumsAndProductsProg {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print(
      "How many numbers do you wish to sum: ");
    int count = keyboard.nextInt();

    System.out.print("Enter numbers: ");
    double[] data = new double[count];
    for (int i = 0; i < count ; i++) {
      // read from keyboard and convert to double
      data[i] = Double.parseDouble(keyboard.next());
    }
    double sum = SumsAndProducts.sum(data);
    System.out.println(
      "Their sum is: " + sum);
  }
}
