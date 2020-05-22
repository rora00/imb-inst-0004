public class AnyAllTester {
 
  public static void main(String[] args) {
    // create some reference variables
    boolean[] array1, array2;
    // construct an all true and an all false array
    array1 = createAllTrue(10);
    // notice we are using the default behaviour to get an all false array
    array2 = new boolean[10];

    // testing
    System.out.println("Initially...");
    System.out.println(
      "\tAre any elements of array1 true? Result: " + AnyAll.any(array1));
    System.out.println(
      "\tAre any elements of array2 true? Result: " + AnyAll.any(array2));

    // changing some values
    array1[3] = false;
    array1[7] = false;
    array2[4] = true;
    array2[6] = true;


    // testing again
    System.out.println("After changing some values...");
    System.out.println(
      "\tAre any elements of array1 true? Result: " + AnyAll.any(array1));
    System.out.println(
      "\tAre any elements of array2 true? Result: " + AnyAll.any(array2));
  }


  public static boolean[] createAllTrue(int size) {
    /*
      preconditions:
        size is a positive integer
      postconditions:
        returns a boolean array with all true values
     */
    boolean[] newArray = new boolean[size];
    for (int i = 0 ;  i < newArray.length ; i++) {
      newArray[i] = true;
    }
    return newArray;
  }

}


