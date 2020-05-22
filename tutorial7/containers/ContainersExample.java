package tutorial7.containers;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainersExample{
  public static void main(String[] args) {
    String[] myArray = new String[3];
    ArrayList<String> myArrayList = new ArrayList<String>();
    HashSet<String> myHashSet = new HashSet<String>();

    // we can fill myArray with three Strings
    myArray[0] = "Spam";
    myArray[1] = "Spam";
    myArray[2] = "Eggs";

    // we can add three Strings to myArrayList
    myArrayList.add("Spam");
    myArrayList.add("Spam");
    myArrayList.add("Eggs");

    // we can add three Strings to myHashSet
    myHashSet.add("Spam");
    myHashSet.add("Spam");
    myHashSet.add("Eggs");

    System.out.println(
      "We have created and filled myArray, myArrayList, and myHashSet");

    // we can iterate over each element of myArray
    for (String s : myArray) {
      System.out.println("Next String in myArray is: " + s);
    }

    // we can iterate over each element of myArrayList
    for (String s : myArrayList) {
      System.out.println("Next String in myArrayList is: " + s);
    }

    // we can iterate over each element of myHashSet
    for (String s : myHashSet) {
      System.out.println("Next String in myHashSet is: " + s);
    }

  }

}

