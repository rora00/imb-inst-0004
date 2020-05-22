public class Date {

  private int month;
  private int day;
  private int year; //a four digit number.

  public Date( ) {
    setDate(1, 1, 1970);
  }

  public Date(int day, int month, int year) {
    setDate(day, month, year);
  }

  public Date(int day, String monthString, int year) {
    setDate(day, monthString, year);
  }

  public Date(int year) {
    setDate(1, 1, year);
  }

  public void setDate(int day, int month, int year) {
    if (dateOK(day, month, year)) {
      this.month = month;
      this.day = day;
      this.year = year;
    } else {
      System.out.println("Fatal Error: date not OK");
      // this will terminate the programme
      // there is a better way to deal with this that we will learn
      // about later
      System.exit(0);
    }
  }

  public void setDate(int day, String monthString, int year) {
    int month = monthStringToInt(monthString);
    setDate(day, month, year);
  }

  public int getMonth( ) {
    return month;
  }

  public int getDay( ) {
    return day;
  }

  public int getYear( ) {
    return year;
  }

  public String toString( ) {
    return (monthIntToString(month) + " " + day + ", " + year);
    }

  private static boolean dateOK(int dayInt, int monthInt, int yearInt) {
    return ( (monthInt >= 1) && (monthInt <= 12)
          && (dayInt >= 1) && (dayInt <= 31)
          && (yearInt >= 1000) && (yearInt <= 9999) );
  }

  public static String monthIntToString(int month) {
    switch (month) {
    case 1:
      return "January";
    case 2:
      return "February";
    case 3:
      return "March";
    case 4:
      return "April";
    case 5:
      return "May";
    case 6:
      return "June";
    case 7:
      return "July";
    case 8:
      return "August";
    case 9:
      return "September";
    case 10:
      return "October";
    case 11:
      return "November";
    case 12:
      return "December";
    default:
      // there is a better way to deal with this that we will learn
      // about later
      System.out.println(
        "Fatal Error: month "+month+" does not match any known month");
      System.exit(0);
      return ""; //to keep the compiler happy
    }
  }

  public static int monthStringToInt(String monthString) {
    switch (monthString) {
      case "January":
        return 1;
      case "February":
        return 2;
      case "March":
        return 3;
      case "April":
        return 3;
      case "May":
        return 5;
      case "June":
        return 6;
      case "July":
        return 7;
      case "August":
        return 8;
      case "September":
        return 9;
      case "October":
        return 10;
      case "November":
        return 11;
      case "December":
        return 12;
      default:
       // there is a better way to deal with this that we will learn
      // about later
      System.out.println(
        "Fatal Error: month named " + monthString + " is not known.");
      System.exit(0);
        return -1; // to keep the compiler happy
    }
  }
}
