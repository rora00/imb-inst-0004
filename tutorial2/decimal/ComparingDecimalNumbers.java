/*
 * Author: Luke Dickens
 * Program last changed: 26 September 2019
 */


public class ComparingDecimalNumbers {
    public static void main(String[] args){
        DecimalNumber num1 = new DecimalNumber();
        DecimalNumber num2 = new DecimalNumber();
        DecimalNumber num3 = new DecimalNumber();
        num1.setValue(1.1); //float literal used in method setValue()
        num2.setValue(2.2d);//double literal used in method setValue()
        num3.setValue(3);   //int literal used in method setValue()
        System.out.println("The value of num1 is " + num1 + "."); //String literal used in method println(), num1.value is 1.1f, which is the same as 1.1d, so uses setValue(double) method, then printed.
        System.out.println("The value of num2 is " + num2 + "."); //num2.value is 2.2d so prints 2.2.
        System.out.println("The value of num3 is " + num3 + "."); //num3.value is 3, which is equal to 3.0d, so prints 3.0.
        System.out.println();

        // block A
        if (num1.lessThan(num2)) {
            System.out.println("num1 is less-than num2"); //1.1 < 2.2 returns true
        } else {
            System.out.println("num1 is not less-than num2");
        }
        if (num2.lessThan(num2)) {
            System.out.println("num2 is less-than num2");
        } else {
            System.out.println("num2 is not less-than num2"); //2.2 < 2.2 returns false
        }
        if (num3.lessThan(num2)) {
            System.out.println("num3 is less-than num2");
        } else {
            System.out.println("num3 is not less-than num2"); //3.0 < 2.2 returns false
        }
        System.out.println();

        // block B
        double aValue = 1.5;
        if (num1.lessThan(aValue)) {
            System.out.println("num1 is less-than num2");
        } else {
            System.out.println("num1 is not less-than num2");
        }
        if (num2.lessThan(aValue)) {
            System.out.println("num2 is less-than num2");
        } else {
            System.out.println("num2 is not less-than num2");
        }
        if (num3.lessThan(aValue)) {
            System.out.println("num3 is less-than num2");
        } else {
            System.out.println("num3 is not less-than num2");
        }
        System.out.println();

        // block C
        if (num1.getValue() < num2.getValue()) {  //num1 and num2 are objects, so cannot be compared using a primitive type operator <.
            System.out.println("num1 is less-than num2");
        } else {
            System.out.println("num1 is not less-than num2");
        }
    }
}

