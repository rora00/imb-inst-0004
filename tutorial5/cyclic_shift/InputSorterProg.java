package tutorial5.cyclic_shift;

import java.util.Arrays;
import java.util.Scanner;

public class InputSorterProg {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print(
      "How many numbers do you wish to sort: ");
    int count = keyboard.nextInt();

    System.out.print("Enter numbers: ");
    int[] data = new int[count];
    for (int i = 0; i < count ; i++) {
      data[i] = keyboard.nextInt();
    }
    Sorter.sort(data);
    System.out.println(
      "Sorted: " + Arrays.toString(data));
  }
}
