public class Dealer {

  public static void main(String args[]) {

    System.out.println("First create three cards and show them:");
    // the ace of hearts
    Card card1 = new Card(1, Card.HEARTS);
    // the two of clubs
    Card card2 = new Card(2, Card.DIAMONDS);
    // the king of spades
    Card card3 = new Card(13, Card.SPADES);

    System.out.print("Our three cards are:\n\t");
    // we do not need to write card1.toString(), java knows to convert the
    // card to a string when we try to append it (with +) to a String
    System.out.println(card1 + " " + card2+ "  " + card3);
    System.out.println();

    // uncomment the following code when you get to question part d)
    /*
    System.out.print("Create an unshuffled Deck object and deal some cards:\n\t");
    Deck deck;
    Deck anotherDeck;
    int some = 10;
    deck = new Deck();
    dealSomeCards(deck, some);
    System.out.print("Deal some more cards:\n\t");
    dealSomeCards(deck, some);

    System.out.print("Now shuffle and deal some cards:\n\t");
    deck.shuffle();
    dealSomeCards(deck, some);
    System.out.println();
    */

    // uncomment the following code when you get to question part e)
    /*
    System.out.println("Assign the same deck to both reference variables.");
    deck = new Deck();
    anotherDeck = deck;
    System.out.print("Checking variable deck:\n\t");
    reportDealtFrom(deck);
    System.out.print("Checking variable anotherDeck:\n\t");
    reportDealtFrom(anotherDeck);
    System.out.print("Now deal from deck:\n\t");
    dealSomeCards(deck, some);
    System.out.print("Checking variable deck:\n\t");
    reportDealtFrom(deck);
    System.out.print("Checking variable anotherDeck:\n\t");
    reportDealtFrom(anotherDeck);
    System.out.println();
    */

    // uncomment the following code when you get to question part f)
    /*
    anotherDeck = new Deck();
    int cutAt = 13;
    System.out.print("Create another fresh deck, try to cut cards and deal:\n\t");
    attemptCutDeck(anotherDeck, cutAt, some);

    System.out.print("Try cutting the cards again:\n\t");
    attemptCutDeck(anotherDeck, cutAt, some);
    */
  }

  // uncomment the code below when you get to part c)
  /*
  // this is a helper method for the main method
  public static void dealSomeCards(Deck deck, int some) {
    Card next;
    for (int c = 0 ; c < some; c++) {
      next = deck.dealCard();
      System.out.print(next + " ");
    }
    System.out.println();
  }
  */

  // uncomment the code below when you get to part e)
  /*
  // this is a helper method for the main method
  public static void reportDealtFrom(Deck deck) {
    System.out.print("Deck is ");
    if (!deck.isDealtFrom()) {
      System.out.print("not ");
    }
    System.out.println("dealt from.");
  }
  */

  // uncomment the code below when you get to part f)
  /*
  // this is a helper method for the main method
  public static void attemptCutDeck(Deck deck, int cutAt, int some) {
    boolean cutSuccessful = deck.cutDeck(cutAt);
    if (cutSuccessful) {
      System.out.print("The cut was successful, here are some cards:\n\t");
      dealSomeCards(deck, some);
    } 
    else {
      System.out.println("The cut was unsuccessful!");
    }
  }
  */
}
