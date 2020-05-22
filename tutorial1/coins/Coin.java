/*
 * Coin.java
 * Author: Rob Miller
 * Program last changed: 19 September 2008
 */

public class Coin {

  private static final int HEADS = 0;
  private static final int  TAILS = 1;
  private int face;

  public Coin() {
    flip();
  }

  public void flip() {
    face = (int)(Math.random()*2);
  }

  public boolean isHeads() {
    return (face == HEADS);
  }

  public String toString() {
    if (isHeads()) {
      return "Heads";
    } else {
      return "Tails";
    }
  }
}

