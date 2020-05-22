package tutorial2.transport;

public class Journey {

  private final String origin, destination, mode;
  private final int cost;

  // add a constructor and getter methods for the four fields.

  // should you add setter methods? Explain.
  public String toString() {
    return "£" + (getCost()/100) + "." + (getCost()%100)
      + ": from " + getOrigin()
      + " to " + getDestination()
      + " by " + getMode();
  }
}
