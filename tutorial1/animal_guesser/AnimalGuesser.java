import java.util.Scanner;
import java.util.Random;

public class AnimalGuesser {
    public static void main(String[] args) {

        String[] allSpecies = 
            new String[]{"Bear", "Lion", "Tiger", "Monkey", "Crocodile"};

        // Randomly initialise the animal
        int secretSpeciesID = new Random().nextInt(allSpecies.length);
        String secretSpecies = allSpecies[secretSpeciesID];
        int secretSize = new Random().nextInt(10)+1;
        Animal secretAnimal = new Animal(secretSpecies, secretSize);

        // initalise the counter and create the Scanner
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        // opening message
        System.out.println(
          "My animal is size 1-10 and is one of these species: ");
        for (String species : allSpecies) 
            System.out.println(species);

        // programme loop: repeatedly ask user to guess and check
        while (counter <= 7) {
            // elicit guess and create animal
            System.out.print("Try to guess the species: ");
            String guessSpecies = scanner.next();
            System.out.print("Try to guess the size: ");
            int guessSize = scanner.nextInt();
            Animal guessAnimal = new Animal(guessSpecies, guessSize);
            // comparing guess with secret
            System.out.println(secretAnimal.compareMessage(guessAnimal));
            if (secretAnimal.equals(guessAnimal)) {
              System.out.println("You win!");
              break;
            } else {
              System.out.println("Guess again");
            }
            counter++;
        }
        if (counter >= 8)
          System.out.println("You've run out of guesses. Bad luck!");
    }
}

