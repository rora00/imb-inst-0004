package tutorial7.cycling;

public class TestCyclable {

  public static void main(String[] args) {

    // Will this work? If so, what will it output?
    Cyclable myCyclable = new Bicycle(3);
    System.out.println("A Bicycle as a Cyclable\n=======================\n");
    runCyclableTest(myCyclable);
    // Will this work? If so, what will it output?
    System.out.println("A Bicycle as a Bicycle\n======================\n");
    Bicycle myBike = new Bicycle(4);
    myBike.steer(90);
    runCyclableTest(myBike);
    // Will this work? If so, what will it output?
    System.out.println(
      "An ExerciseBike as a Cyclable\n=============================\n");
    Cyclable myCyclable2 = new ExerciseBike();
    runCyclableTest(myCyclable2);

    // Commented code A: 
    // Will any of these lines work if you uncomment them? Why?/Why Not?
     
      /* myCyclable2 =  myBike;
      myBike = myCyclable2;
      myBike = myCyclable; */
     

    // Commented code B: 
    // Will any of these lines work if you uncomment them? Why?/Why Not?
    /* 
      myBike.steer(45);
      myCyclable.steer(45);
      myCyclable2.steer(45);
      ((Bicycle)myCyclable).steer(45);
      ((Bicycle)myCyclable2).steer(45);
     */

  }

  public static void runCyclableTest(Cyclable aCyclable) {
    for (double speed = 1.0 ;  speed < 3.0 ; speed += 1.2) {
      System.out.println("Trying speed of " + speed + "\n--------------------");
      // cycling a little
      aCyclable.cycle(speed);
      // changing up and cycling some more
      aCyclable.changeUp();
      aCyclable.cycle(speed);
      // changing back down and cycling some more
      aCyclable.changeDown();
      aCyclable.cycle(speed);
      System.out.println();
    }


  }
}
