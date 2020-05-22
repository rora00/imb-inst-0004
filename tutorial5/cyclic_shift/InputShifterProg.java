package tutorial5.cyclic_shift;

import java.util.Arrays;
import java.util.Scanner;

public class InputShifterProg {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print(
      "How many numbers do you want in your array: ");
    int count = keyboard.nextInt();

    System.out.print("Enter numbers: ");
    int[] data = new int[count];
    for (int i = 0; i < count ; i++) {
      data[i] = keyboard.nextInt();
    }

    System.out.println(
      "Your original array looks like this: " + Arrays.toString(data));
    System.out.print(
      "How many positions do you want to shift by: ");
    int shift = keyboard.nextInt();

    // You should finish this code to test your shift operations
    System.out.println("This test is incomplete.");    
  }
}
