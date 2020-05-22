package tutorial6.recursive_arithmetic;

import java.util.Arrays;

public class SumsAndProducts {

  public static double sum(double[] data) {
    /*
      precondition: data is non-empty array
      postcondition: sums the elements in data
     */
    // this makes use of the overloaded sum method below
    return sum(data, 0);
  }
  
  public static double sum(double[] data, int from) {
    /*
      precondition:
        data is non-empty array, from is positive and less than data.length
      postcondition:
        returns sum of the elements in data starting at position from going to
        the end of the array
     */
    // you WILL NEED to edit this method
  }
  

}
