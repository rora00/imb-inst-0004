/*
 * Created: 11th October 2019
 * Author: Luke Dickens
 * Last Modified: 11th October 2019
 */

public class Balloon {

  // modify the attributes as described
  private static boolean alternates = false;
  private static String[] allColours = new String[]{"Red", "Green", "Blue"};
  private static int index = 0;
  private String colour;

  // DO NOT EDIT the constructor or add any other constructors
  public Balloon() {
    colour = new String(allColours[index]);
    if (alternates) {
      // colour alternates
      incrementIndex();
    }
  }

  // DO NOT EDIT the toString method
  public String toString() {
      return "Balloon(colour:" + colour + ")";
  }

  // DO NOT EDIT the incrementIndex method
  public static void incrementIndex() {
    // switch to the next colour in allColours
    index++;
    // when we get the end of the array reset to 0
    index %= allColours.length;
  }

  // add the switchAlternates method
  public static void switchAlternates(){
    alternates = !alternates; 
  }

  // add the createBalloons method
  public static Balloon[] createBalloons(int number){
    Balloon[] balloons = new Balloon[number];
    for (int i = 0; i < balloons.length; i++){
      balloons[i] = new Balloon();
    } return balloons;
  }
}
