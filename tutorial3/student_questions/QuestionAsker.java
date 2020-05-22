package tutorial3.student_questions;

// these imports will help us to load the data from file
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class QuestionAsker {
  public static void main(String[] args) {
    String[] names = loadNamesFromFile(args[0]);
    // this class just loads the names from file it does nothing else right now
  }

  public static String[] loadNamesFromFile(String filename) {
    // this method read the student names from file 'filename'
    // this code is provided for you, you don't need to understand it right now
    try {
      Charset ENCODING = StandardCharsets.UTF_8;
      Path path = Paths.get(filename);
      return Files.readAllLines(path, ENCODING).toArray(new String[0]);
    } catch (IOException e) {
      System.out.println("There is a problem loading names from file.");
      System.exit(0); // exit programme if cannot load file
    }
    return new String[0]; // this keeps the compiler happy.
  }
}
