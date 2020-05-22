package tutorial4.polya_urn;

class PolyaUrn {

  private int[] ballCounts;
  private int lastDraw;

  public PolyaUrn() { // Sets up PolyaUrn by rolling it
    ballCounts = new int[2]; // initially two possibilities
    ballCounts[0] = 1;
    ballCounts[1] = 1;
    // last draw is not a meaningful value until a ball is drawn.
    lastDraw = -1; // intially not a meaningful value
  }

  public int getLastDraw() {
    /*
     * precondition: urn must have been drawn from at least once
     * returns the value of the last draw (-1 if not drawn from)
     */
    return lastDraw;
  }

  public void draw() {
    /*
     * This method draws a random ball from the urn, then updates the state
     * of the urn to reflect this draw
     */
    // You WILL NEED to implement this method
  }

  // You may need to add additional methods

  public String toString() {
    String s = "Polya Urn\n=========\n\n";
    s += "Ball-counts are as follows:\n\n";
    s += " Value\t| Count\n";
    s += "----------------\n";
    for (int ballValue = 0; ballValue < ballCounts.length ; ballValue++) {
      s += "  " + ballValue + "\t|  " + ballCounts[ballValue] + "\n";
    }
    return s;
  }
}

