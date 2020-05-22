public class LockableDoor {

  private boolean open;
  private boolean locked;

  public LockableDoor(boolean open) {
    this.open = open;
    this.locked = false;
  }

  public void close() {
    System.out.println("Closing...");
    this.open = false;
  }

  public void unlock() {
    System.out.println("Unlocking...");
    this.locked = false;
  }

  public String toString() {
    return "LockableDoor(" + (open? "open": "closed") + ":"
        + (locked? "locked": "unlocked")+ ")";
  }

  public void attemptOpen(){
    System.out.println("Attempting to open...");
    if(this.locked == false){
      this.open = true;
      System.out.println("Success!");
    } else System.out.println("Cannot open, door is locked!");
  }

  public void attemptLock(){
    System.out.println("Attempting to lock...");
    if(this.open == false){
      this.locked = true;
      System.out.println("Success!");
    } else System.out.println("Cannot lock, door is open!");
  }
}
