package tutorial4.polya_urn;

class PolyaUrnProg {

  public static void main(String[] args) {
    PolyaUrn myUrn = new PolyaUrn();
    // draw and report
    myUrn.draw();
    System.out.println("First draw from urn is: " + myUrn.getLastDraw());
    System.out.println();
    System.out.println(myUrn);
    System.out.println();
    // draw again and report
    myUrn.draw();
    System.out.println("Second draw from urn is: " + myUrn.getLastDraw());
    System.out.println();
    System.out.println(myUrn);
    System.out.println();

    int numDraws = 100; // we will make another 98 draws from the urn

    for (int i = 0 ; i < numDraws-2 ; i++) {
      myUrn.draw();
    }
    System.out.println("...and after 98 more draws:\n");
    System.out.println(myUrn);
  }
}

