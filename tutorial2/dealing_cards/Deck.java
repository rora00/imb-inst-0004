import java.util.Random;

public class Deck {

  public static final int NUMCARDS = 52;
  // this generator is needed for the shuffle method. Do not remove it.
  private static Random generator = new Random();
  private Card[] cards;
  private int topOfDeck;

  public Deck() {
    // You WILL NEED to edit this method, below this line
    int pos = 0;
    // create a Card array and insert cards in suit and value order
    this.cards = new Card[NUMCARDS];
    for(int suit : Card.getAllSuits()) {
      for(int value : Card.getAllFaceValues()) {
        this.cards[pos] = new Card(value, suit);
        pos++;
      }
    }
    resetTopOfDeck();
  }

  // a helper method
  private void resetTopOfDeck() {
    // resets the top of the deck without changing the order of the cards
    topOfDeck = 0;
  }

  public void shuffle() {
    // Randomly orders the deck
    int newPos;
    // for each card position in pack
    for(int pos=0; pos < 51; pos++) {
      // choose a random card with a higher index
      newPos = generator.nextInt(NUMCARDS-pos) + pos;
      // switch the positions of the two cards
      switchCards(pos, newPos);
    } 
    // reset the top of the pack.
    topOfDeck = 0;
  }

  // A helper function for the shuffle method
  private void switchCards(int position1, int position2) {
    Card temp = cards[position1];
    cards[position1] = cards[position2];
    cards[position2] = temp;
  }

}
