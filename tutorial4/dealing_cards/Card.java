public class Card {

  public static final int HEARTS=0, CLUBS=1, DIAMONDS=2, SPADES=3;
  int faceValue;
  int suit;

  // String representation of Card
  public String toString() {
    return faceValueToString(getFaceValue()) + suitToString(getSuit());
  }

  // a helper method for toString
  private static String faceValueToString(int faceValue) {
    switch(faceValue) {
      case 1: return "A";
      case 13: return "K";
      case 12: return "Q";
      case 11: return "J";
      default: return String.valueOf(faceValue);
    }
  }

  // a helper method for toString
  private static String suitToString(int suit) {
    // You SHOULD NOT edit this method!
    switch(suit) {
      case 0: return "H"; // use "♥" if your machine supports unicode
      case 1: return "C"; // use "♣" if your machine supports unicode
      case 2: return "D"; // use "♦" if your machine supports unicode
      case 3: return "S"; // use "♠" if your machine supports unicode
      default: return "?";
    }
  }

  // gets all possible suits in an array
  public static int[] getAllSuits() {
    // You SHOULD NOT edit this method!
    int[] suits = new int[4];
    suits[0] = HEARTS;
    suits[1] = CLUBS;
    suits[2] = DIAMONDS;
    suits[3] = SPADES;
    return suits;
  }

  // gets all possible face values for Card
  public static int[] getAllFaceValues() {
    int[] values = new int[13];
    for(int faceValue = 1; faceValue <= 13; faceValue++)
      values[faceValue-1] = faceValue;
    return values;
  }

}

