public class InternationalOven {

  private double tempCelcius;

  public InternationalOven() {
    this.tempCelcius = 100.0;
  }

  public static double celciusToFahrenheit(double c){
    return ((9 * c) / 5) + 32;
  }

  public static double fahrenheitToCelcius(double f){
    return (5 * (f - 32)) / 9;
  } 

  public String toString() {
    String regionStr = "UK";
    double temp = getTempCelcius();
    return String.format("Oven[%s](temp:%.1f)", regionStr, temp);
  }

  public double getTempCelcius(){
    return tempCelcius;
  }

  public double getTempFahrenheit(){
    return celciusToFahrenheit(tempCelcius);
  }

  public void setTempCelcius(double c){
    this.tempCelcius = c;
  }

  public void setTempFahrenheit(double f){
    this.tempCelcius = fahrenheitToCelcius(f);
  }
}
