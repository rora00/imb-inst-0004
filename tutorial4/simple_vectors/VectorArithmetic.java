public class VectorArithmetic { 
  public static void main(String[] args) {

    System.out.println("We create two SimpleVectors and they look like this:");
    SimpleVector v1 = new SimpleVector(8,7);
    SimpleVector v2 = new SimpleVector(8,7);
    SimpleVector v3 = new SimpleVector(7,8);
    SimpleVector v4 = null;

    //4a
    System.out.println("v1 = " + v1.toString());
    System.out.println("v2 = " + v2.toString());

    //4b
    System.out.println("\nTesting equals method:");
    System.out.println("v1.equals(v2) evaluates to " + (v1.equals(v2) ? true : false));
    System.out.println("v1.equals(v3) evaluates to " + (v1.equals(v3) ? true : false));
    System.out.println("v1.equals(v4) evaluates to " + (v1.equals(v4) ? true : false));

    //4c
    System.out.println("\n" + v1.negation());
    System.out.println(v1.add(new SimpleVector(1,1)));
    System.out.println(v1.subtract(new SimpleVector(1,1)));
    System.out.println(v1.multiply(50));

    //unassessed
    System.out.println("\n" + v1.length());
    System.out.println(SimpleVector.sum(new SimpleVector[]{v1, v2, v3}));
  }
}
