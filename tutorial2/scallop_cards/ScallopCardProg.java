package tutorial2.transport;

public class ScallopCardProg {

  public static void main(String[] args) {

    System.out.println("### Scallop Card Program Starting ###\n\n");

    Journey toWork1 = new Journey("Ladywell", "Lewisham", "Bus", 130);
    Journey toWork2 = new Journey("Lewisham", "Victoria", "Train", 310);
    Journey fromWork1 = new Journey("Victoria", "Lewisham", "Train", 310);
    Journey fromWork2 = new Journey("Lewisham", "Ladywell", "Bus", 130);
    Journey[] workDay = new Journey[4];
    workDay[0] = toWork1;
    workDay[1] = toWork2;
    workDay[2] = fromWork1;
    workDay[3] = fromWork2;
    System.out.println(
      "Created an array of " + workDay.length + " Journey's, these are:");
    for (Journey journey : workDay) {
      System.out.println("\t"+journey);
    }


    // XXX uncomment the method below to when you get to question part c)
    /* 
    System.out.println("Creating Scallop Card...");
    ScallopCard myCard = new ScallopCard(1);
    System.out.println("ScallopCard created with id: " + myCard.getCardId());    
    myCard.showJourneyHistory();
    myCard.showBalance();
    */

    // XXX uncomment the code below when you get to question part d)
    /*
    System.out.println("Adding £50 to the card's balance...");
    myCard.addBalance(5000);
    */

    // XXX uncomment the code below when you get to question 5.f)
    /*
    // this line calls a helper method defined just below. 
    // You will need to uncomment that too when you get question 5.f)
    addJourneyGroupToCard(workDay, myCard);
    myCard.showJourneyHistory();
    */

    System.out.println("\n\n### Scallop Card Program Finished ###");
  }

  // XXX uncomment the code below when you get to question 5.f)
  /*
  private static void addJourneyGroupToCard(
      Journey[] journeyGroup, ScallopCard card) {
    for (Journey journey : journeyGroup ) {
      System.out.println("\tTrying to add journey:\n\t\t" + journey);
      if (card.addJourney(journey)) {
        System.out.println("\tJourney added okay\n");
      } else {
        System.out.println("\tJourney not added\n");
        break;
      }
    }      
    System.out.println();
    card.showBalance();
    System.out.println();
  }
  */
}
