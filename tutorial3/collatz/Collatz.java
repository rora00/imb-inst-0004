public class Collatz {

  public static void main(String[] args) {
    // You will put the main programme execution here
    int init = Integer.parseInt(args[0]);
    System.out.print(init);
    while (init != 1 && init > 0){
      init = next(init);
      System.out.print(" " + init);
    }
  }
  // add the method next as described on the tutorial sheet
  // an object of type Collatz is not required to use this method as it is a class method.
  public static int next(int n){
    if(n % 2 == 0){
      return n / 2;
    } else {
      return (3 * n) + 1;
    }
  }
}
