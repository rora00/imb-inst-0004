import java.util.Scanner;
import java.util.Random;

public class FamineAndFeast {


  public static void main ( String [] args ) {
    System.out.println("You are playing Famine or Feast!" );
    System.out.println();

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Kingdom kingdom = new Kingdom(random);

    boolean exit = false;
    while (!exit) {
      System.out.println(kingdom.toString());
      exit = topMenu(kingdom, scanner);
      System.out.println();
      if (kingdom.gameWon()) {
        System.out.println(
          "You have won. Well done!");
        return;
      } else if (kingdom.gameLost()) {
        System.out.println(
          "Your kingdom has run out of grain. You lose!");
        return;
      }
    }
    System.out.println("Exiting...");
  }

  public static boolean topMenu(Kingdom kingdom, Scanner scanner) {
    System.out.println("Please choose your next action: ");
    System.out.println("1: Buy/Sell Grain ");
    System.out.println("2: Hire workers");
    System.out.println("3: Next Season");
    System.out.println("4: Exit");
    while(true) {
      int response = scanner.nextInt();
      switch(response) {
        case 1:
          buyGrainMenu(kingdom, scanner);
          return false;
        case 2:
          hireWorkersMenu(kingdom, scanner);
          return false;
        case 3:
          String message = kingdom.newSeason();
          System.out.println(message);
          return false;
        case 4:
          return true;
        default :
          System.out.println("Invalid response , please try again!");
      }
    }

  }

  public static void buyGrainMenu(Kingdom kingdom, Scanner scanner) {
    System.out.println(
      "1 grain unit is bought for 1 gold, and sold at 1 gold.");
    System.out.println(
      "How much would you like to buy (enter negative number to sell)?");
    int units = scanner.nextInt();
    String message = kingdom.tradeGrain(units);
    System.out.println(message);
  }

  public static void hireWorkersMenu(Kingdom kingdom, Scanner scanner) {
    System.out.println(
      "Workers are hired for 1 gold per season, and eat 1 grain per season.");
    System.out.println(
      "How many workers would you like to hire?");
    String message;
    int units = scanner.nextInt();
    message = kingdom.hireWorkers(units);
    System.out.println(message);
  }
}
