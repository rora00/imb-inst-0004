public class Echo {

  public static void main(String[] args) {
    int numberOfArguments = args.length; 
    System.out.println("You have input " + numberOfArguments + " arguments");
    if (numberOfArguments > 0) {
      System.out.println("These are:");
      for (int i = 0; i < numberOfArguments ; i++) {
        System.out.println("\tArgument " + i + " is " + args[i]);
      }
    }
  }
}
