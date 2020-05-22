import java.util.Scanner;
import java.util.Random;

public class Animal {

    private String species;
    private int size;

    public Animal(String species, int size) {
        // complete this constructor method body
        this.species = species;
        this.size = size;
    }

    public boolean equals(Animal other) {
        // complete this method body
        if (other.species.equals(this.species) && other.size == this.size){
            return true;
        } else {
            return false;
        }
    }
    
    public String compareMessage(Animal other) {
        // complete this method body
        if(other.species.equals(this.species) == false){
            return "Wrong Species";
        } else if (other.size < this.size){
            return "Too small";
        } else if (other.size > this.size){
            return "Too large";
        } else return "Perfect match";
    }  
}

