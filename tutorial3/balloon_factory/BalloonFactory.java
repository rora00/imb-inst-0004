/*
 * Created: 11th October 2019
 * Author: Luke Dickens
 * Last Modified: 11th October 2019
 */
import java.util.Arrays;

public class BalloonFactory {

  public static void main(String[] args) {

    // Block A
    Balloon b1, b2, b3, b4;
    b1 = new Balloon();
    b2 = new Balloon();
    b3 = new Balloon();
    b4 = new Balloon();
    System.out.println("Created 4 balloons:");
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println();

    // Block B
    System.out.println("Switch alternates.\n");
    Balloon.switchAlternates();
    b1 = new Balloon();
    b2 = new Balloon();
    b3 = new Balloon();
    b4 = new Balloon();
    System.out.println("Created another 4 balloons:");
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println();

    // Block C
    int number = 10;
    // use the createBalloons method to create an array of Balloon objects
    // and assign them to the balloons variable
    
    //Balloon.switchAlternates();

    Balloon[] balloons = Balloon.createBalloons(number);
    System.out.println("Created balloon array with " + number + " balloons:");
    System.out.println(Arrays.toString(balloons));
    System.out.println(balloons);
  }
}