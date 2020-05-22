public class TestInternationalOven {

  public static void main(String[] args) {
    System.out.println("Testing InternationalOven");
    System.out.println();

    // Block A
    System.out.println("Block A");
    System.out.println("Converting Celcius to Fahrenheit");
    double[] celciusTemperatures = {-273., 0., 100., 180., 200.  };
    for (double currentCelcius : celciusTemperatures) {
        double currentFahrenheit = 
          InternationalOven.celciusToFahrenheit(currentCelcius);
        System.out.println(String.format(
          "%.1fC is equal to %.1fF", currentCelcius, currentFahrenheit));
    }
    System.out.println();
    System.out.println("Converting Fahrenheit to Celcius");
    double[] fahrenheitTemperatures = {-20., 32., 212., 350., 700.};
    for (double currentFahrenheit : fahrenheitTemperatures) {
        double currentCelcius =
          InternationalOven.fahrenheitToCelcius(currentFahrenheit);
        System.out.println(String.format(
          "%.1fF is equal to %.1fC", currentFahrenheit, currentCelcius));
    }
    System.out.println();

    // Block B
    System.out.println("Block B");
    InternationalOven oven = new InternationalOven();
    System.out.println("Newly created oven: " + oven.toString());
    System.out.println(
      "Oven temperature in Celcius is " + oven.getTempCelcius());
    System.out.println(
      "Oven temperature in Fahrenheit is " + oven.getTempFahrenheit());
    System.out.println();

    // Block C
    System.out.println("Block C");
    double newCelcius = 180.;
    System.out.println("Setting oven in Celcius to " + newCelcius);
    oven.setTempCelcius(newCelcius);
    System.out.println("Now oven is: " + oven);
    double newFahrenheit = 350.;
    System.out.println("Setting oven in Fahrenheit to " + newFahrenheit);
    oven.setTempFahrenheit(newFahrenheit);
    System.out.println("Now oven is: " + oven);
    System.out.println();

    // Block D - code relating to this block is not assessed
//    System.out.println("Block D");
//    System.out.println("Testing switchRegion");
//    System.out.println("Initially oven looks like this:\n\t" + oven);
//    System.out.println("...and getTemp() returns: " + oven.getTemp());    
//    InternationalOven.switchRegion();    
//    System.out.println("After switchRegion, oven looks like this:\n\t" + oven);
//    System.out.println("...and getTemp() returns: " + oven.getTemp());    
//    System.out.println();


  }
}
