public class LockableDoorProg {

  public static void main(String[] args) {
    //encapsulation ensures that the used cannot change the state of the door through the client program.
    LockableDoor door = new LockableDoor(false);
    System.out.println(door);
    //door.locked = true;
    //door.open = true;
    System.out.println(door);
    door.attemptOpen();
    System.out.println(door);
    door.attemptLock();
    System.out.println(door);
    door.close();
    System.out.println(door);
    door.attemptLock();
    System.out.println(door);
    door.attemptOpen();
    System.out.println(door);
    door.unlock();
    System.out.println(door);
  }
}
