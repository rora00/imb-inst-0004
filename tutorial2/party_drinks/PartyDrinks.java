/*
 * PartyDrinks.java
 * Author: Luke Dickens
 * Program last changed: 19 September 2019
 */

public class PartyDrinks {

    public static void main(String[] args) {
        Drink lukesDrink = null;
        Drink karensDrink = null;
        Drink danielasDrink = null;

        declareDrink("Luke", lukesDrink);
        declareDrink("Karen", karensDrink);
        declareDrink("Daniela", danielasDrink);
        System.out.println();

        // everyone is allocated a drink of a particular flavour
        lukesDrink = new Drink("Lemon");
        karensDrink = new Drink("Orange");
        danielasDrink = new Drink("Strawberry");

        declareDrink("Luke", lukesDrink);
        declareDrink("Karen", karensDrink);
        declareDrink("Daniela", danielasDrink);
        System.out.println();

        // Luke and Karen's drinks are filled
        lukesDrink.fill();
        karensDrink.fill();
        // Uh-oh, what is happening here?
        danielasDrink = lukesDrink;
        
        declareDrink("Luke", lukesDrink);
        declareDrink("Karen", karensDrink);
        declareDrink("Daniela", danielasDrink);
        System.out.println();

        // Everyone drinks a little of their drink
        lukesDrink.consume(0.2);
        karensDrink.consume(0.4);
        danielasDrink.consume(0.6);
        
        declareDrink("Luke", lukesDrink);
        declareDrink("Karen", karensDrink);
        declareDrink("Daniela", danielasDrink);
        System.out.println();
    }


  private static void declareDrink(String name, Drink drink) {
        if (drink == null) {
            System.out.println(name + " does not have a drink");
        } else {
            System.out.println(name + "'s drink is: " + drink.toString());
        }

    }
}

