import java.util.Random;

public class Kingdom {

  private int gold;
  private int grain;
  private int workers;
  private final Random random;

  public Kingdom(Random random) {
    this.gold = 10;
    this.grain = 10;
    this.workers = 5;
    this.random = random;
  }

  public String toString() {
    String str = "Your Kingdom\n============\n";
    str += resourceToString("Gold: ", "o", this.gold);
    str += resourceToString("Grain: ", "*", this.grain);
    str += resourceToString("Workers: ", "☺", this.workers);
    return str;
  }

  public static String resourceToString(String subtitle, String token, int value) {
    String str = subtitle;
    for (int i = 0; i < value ; i++) {
      str += token;
      if ((subtitle.length() + i)%60 == 0) {
        str += "\n";
      }
    }
    str += "\n";
    return str;
  }

  public boolean gameWon() {
    return this.gold > 50;
  }

  public boolean gameLost() {
    return this.workers == 0;
  }

  public String newSeason() {
    String message = "";
    // calculate production
    int extraGrain;
    int workersProduce = 0;
    int workersEat = 0;
    if (this.random.nextInt(2) == 0) {
      message +=
        "Bad luck! It is a famine year (there is no extra grain).\n";
      extraGrain = 0;
    } else {
      message +=
        "Great news! It is a feast year (there are 2 extra grain per worker).\n";
      extraGrain = 2;
    }
    for (int w = 0; w < this.workers; w++) {
      workersProduce += this.random.nextInt(3) + extraGrain;
      workersEat += this.random.nextInt(2)+1;
    }
    // calculate your grain supply
    message += "Your workers produce " + workersProduce + " grain.\n";
    this.grain += workersProduce - workersEat;
    if (this.grain < 0) {
      this.grain = 0;
      this.workers = 0;
      message += "Your workers starved; you did not have enough grain.\n";
      return message;
    } else {
        message += "Your workers eat " + workersEat + " grain.\n";
    }
    // calculate your gold
    int workersCost = this.workers;
    this.gold -= workersCost;
    if (this.gold < 0) {
      message +=
         "You cannot afford to pay your workers; you do not have enough gold.\n";
      return message;
    } else {
      message += "Your workers are paid " + workersCost + " gold.\n";
    }
    // normal return
    return message;
  }

  public String hireWorkers(int moreWorkers) {
    if (moreWorkers > 0) {
      this.workers += moreWorkers;
      return "You have hired "+ moreWorkers + " more workers.\n";
    }
    else {
      return "You must hire a positive number of workers.\n";
    }
  }

  public String tradeGrain(int units) {
    if(units >= 0) {
      return buyGrain(units);
    } else {
      return sellGrain(-units);
    }
  }

  public String buyGrain(int units) {
    String message;
    if (this.gold >= units) {
      this.gold -= units;
      this.grain += units;
      return "You have bought "+ units + " units of grain.\n";
    } else {
      return "You cannot afford this grain.\n";
    }
  }

  public String sellGrain(int units) {
    if (this.grain >= units) {
       this.grain -= units;
       this.gold += units;
       return "You have sold "+ units + " units of grain.\n";
    } else {
       return "You don't have enough grain.\n";
    }
  }

}
