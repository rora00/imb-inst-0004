/*
 * Drink.java
 * Author: Luke Dickens
 * Program last changed: 19 September 2019
 */

public class Drink {

  // you MUST add some attributes to this class
  private String flavour;
  private double level;

  // You MUST add a constructor, look at the slides for examples
  public Drink(String flavour){
    this.flavour = flavour;
    this.level = 0;
  }

  // You MUST add one or more methods, look at the slides (in particular the one
  // entitled "Anatomy of a Method") for guidance on how to declare one.
  public void fill(){
    this.level = 1;
  }

  public void consume(double amount){
    if(this.level <= amount){
      this.level = 0;
    } else if(amount < this.level && amount > 0) {
      this.level = this.level - amount;
    }
  }

  public String toString() {
      return "Drink(flavour:" + flavour + ", " + level + ")";
  }

}

