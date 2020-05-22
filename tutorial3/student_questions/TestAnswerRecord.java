package tutorial3.student_questions;

public class TestAnswerRecord {
 

  public static void main(String[] args) {
    AnswerRecord myRecord = new AnswerRecord();
    myRecord.addName("Stan Marsh");
    myRecord.addName("Kyle Broflovski");
    myRecord.addName("Eric Cartman");
    myRecord.addName("Kenny McCormick");
    myRecord.addName("Butters Stotch");
    myRecord.addName("Wendy Testaburger");

    myRecord.showAnswerRecord();

    // Question part b) - uncomment this code when you attempt this question 
    /*
    System.out.println("\n\nMarking some students has having answered a question");
    System.out.println("Also, adding another student name\n");
    myRecord.markAsAnswered("Wendy Testaburger");
    myRecord.addName("Shelly Marsh");
    myRecord.markAsAnswered("Eric Cartman");
    myRecord.markAsAnswered("Shelly Marsh");
    myRecord.showAnswerRecord();
     */


    // Question part c) - uncomment this code when you attempt this question 
    /*
    String[] moreNames = {"Bebe Stevens", "Tweek Tweak", "Craig Tucker", "Jimmy Valmer"}
    myRecord.addNames(moreNames);
    myRecord.showAnswerRecord();
     */

    // Question part d) - uncomment this code when you attempt this question 
    /*
    System.out.println("\n\nChecking whether students have answered or not:");
    String[] namesToCheck = { "Stan Marsh", "Eric Cartman", "Shelly Marsh"};
    for (String nameToCheck : namesToCheck ) {
      System.out.print("\t" + nameToCheck);

      if (myRecord.checkWhetherStudentAnswered(nameToCheck)) {
        System.out.println(" has already answered!");
      } else {
        System.out.println(" hasn't answered yet!");
      }
    }
     */


    // Question part e) - uncomment this code when you attempt this question 
    /*
    System.out.println("\n\nList of students that haven't answered a question:");
    String[] notAnsweredYet = myRecord.allNamesWhoHaveNotAnswered();
    for (String name : notAnsweredYet ) {
      System.out.println("\t" + name);
    }
     */
  }


}
