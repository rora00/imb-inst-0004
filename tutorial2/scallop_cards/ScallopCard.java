package tutorial2.transport;

public class ScallopCard {

  private final int cardId;
  private int balance;
  private Journey[] journeys;

  public ScallopCard(int cardId) {
    this.cardId = cardId;
    this.balance = 0;
    this.journeys = new Journey[0];
  }

  // write the three getter methods

  // write an addBalance method

  // write a canTravel method

  // XXX uncomment the method below to when you get to question part c)
  /*
  public void showBalance() {
    int balance = getBalance();
    System.out.println(
      "Card id: " + getCardId() + ": You have £" + (balance/100) + "."
      + (balance%100) + " remaining");
  }
  */


  // XXX uncomment the method below to when you get to question part f)
  /*
  public boolean addJourney(Journey intended) {
    if (canTravel(intended)) {
      // if there is enough money, reduce balance then add the intended journey
      // to the beginning of journeys 
      addBalance(-intended.getCost());
      // store the old set of journeys elsewhere
      Journey[] oldJourneys = journeys;
      // now create and fill a new Journey array including the intended journey
      int numberOfJourneys = oldJourneys.length;
      journeys = new Journey[numberOfJourneys+1];
      // insert the intended journey first
      journeys[0] = intended;
      // fill the rest of the array with the other journeys
      for (int j = 1; j < journeys.length ; j++) {
        journeys[j] = oldJourneys[j-1];
      }
      // we return true to say that we have successfully added the journey
      return true;
    } else {
      // return false to say that we could not add the journey
      return false;
    }
  }
  */

  public void showJourneyHistory() {
    System.out.println("Your journeys, most recent first, are:");
    // You WILL NEED to complete this method, to print out all the journeys.
  }

}
