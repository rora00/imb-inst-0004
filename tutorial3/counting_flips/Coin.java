// CoinProg.java
// Author: Rob Miller
// Program last changed: 19 September 2008

public class Coin {

  private static final int HEADS = 0;
  private static final int TAILS = 1;
  private int face;
  private int thisCount = 0;
  private static int allCount = 0;

  public Coin() {
    flip();
  }

  public void flip () {
    face = (int)(Math.random()*2);
    thisCount = totalNumberOfFlipsForThisCoin() + 1;
    allCount = totalNumberOfFlipsForAllCoins() + 1;
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

  public int totalNumberOfFlipsForThisCoin(){
    return thisCount;
  }

  public static int totalNumberOfFlipsForAllCoins(){
    return allCount;
  }
}

