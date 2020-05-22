/*
 * A simple class for wrapping primitive double as objects author
 * Luke Dickens based on previous material by Martin O'Reilly and Rob Miller.
 * 19 September 2019
*/

public class DecimalNumber {

    private double value;

    public DecimalNumber() {
        this.value = 0;
    } 
    public DecimalNumber(int value) {
        this.value =(double)(value);
    } 
    //double value constructor
    public DecimalNumber(double value){
        this.value = value;
    }
    //copy constructor
    public DecimalNumber(DecimalNumber DecimalNumber){
        this.value = DecimalNumber.value;
    }

    // You MUST add one or more constructors to this method
    
    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(this.getValue());
    }

    public boolean lessThan(DecimalNumber other){
        if(this.value < other.value){
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThan(double other){
        if(this.value < other){
            return true;
        } else {
            return false;
        }
    }

}
