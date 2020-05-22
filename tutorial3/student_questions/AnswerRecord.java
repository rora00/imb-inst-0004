package tutorial3.student_questions;

public class AnswerRecord {

  /*
    This class keeps a collection of students names in the order that they
    enter the virtual classroom and a list of booleans that keeps track of 
    whether they have answered a question in class.
   */
  private String[] names;
  private boolean[] haveAnswered;


  public AnswerRecord() {
    /*
      preconditions: none
      postconditions: 
        constructs a new AnswerRecord object with an empty array of student
        names and an empty list of booleans haveAnswered
     */
    this.names = new String[0];
    this.haveAnswered = new boolean[0];
  }


  public void addName(String newName) {
    /*
      preconditions:
        name does not already exist in names
      postconditions: 
        grows the names and haveAnswered arrays by one element.
        Adds newName to the last element of names
        Adds a false value to the last element of haveAnswered
     */

    // move the names to oldNames and haveAnswered to oldHaveAnswered
    String[] oldNames = this.names;
    boolean[] oldHaveAnswered = this.haveAnswered;
    // create new String and boolean arrays that are 1 element larger than the
    // previous arrays.
    this.names = new String[oldNames.length+1];
    this.haveAnswered = new boolean[oldNames.length+1];
 
     // copy the elements of oldNames to names, and oldHaveAnswered to haveAnswered
    for (int i = 0; i < oldNames.length ;  i++) {
      this.names[i] = oldNames[i];
      this.haveAnswered[i] = oldHaveAnswered[i];
    }

    // the new name is added at the end and a false value to indicate that
    // the new student has yet to answer a question
    this.names[this.names.length-1] = newName;
    this.haveAnswered[names.length-1] = false;
  }

  public void showAnswerRecord() {
    /*
      prints to screen the list of students and whether they have answered a 
      question or not
     */
    System.out.println("Student Answer Record\n");

    System.out.println("Student\t\t\tHas Answered");
    System.out.println("------------------------------------");
    for (int i = 0 ; i < this.names.length ; i++) {
      System.out.println(this.names[i] + "\t\t" + this.haveAnswered[i]);
    }
  }

}
