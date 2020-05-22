public class AnyAll {
 
  /*
    Complete the method called any in the way described on the tutorial sheet
    preconditions: none
    postcondition: 
      returns true if values contains any elements that are true
      returns false otherwise
   */
  public static boolean any(boolean[] values) {
    // complete this method
    boolean b = false;
    for (boolean i : values){
      if(i != b){
        b = true;
      }
    } return b;
  }

  /*
    Write a method called all as described in the tutorial sheet
    preconditions: none
    postcondition: 
      returns true if values contains only elements that are true
      returns false otherwise
   */
  public static boolean all(boolean[] values){
    boolean b = true;
    for (boolean i : values){
      if(i != b){
        b = false;
      }
    } return b;
  }

}
