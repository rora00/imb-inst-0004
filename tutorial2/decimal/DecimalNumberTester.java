// Author: Rob Miller
// Program last changed: 26 September 2008

/* This program tests the DecimalNumber class enhanced with a copy constructor.   */ 

public class DecimalNumberTester
{
    public static void main(String[] args)
    {
        DecimalNumber num1 = new DecimalNumber(10);
        DecimalNumber num2 = new DecimalNumber(20.0d);
        DecimalNumber num3 = new DecimalNumber(num2);
        System.out.println("The value of num1 starts as " + num1 + ".");    //Object uses DecimalNumber(int) constructor, 10 is converted to double 10.0 then printed.
        System.out.println("The value of num2 starts as " + num2 + ".");    //Object uses DecimalNumber(double) constructor, 20.0d is printed.
        System.out.println("The value of num3 starts as " + num3 + ".");    //Object uses DecimalNumber(DecimalNumber) consturctor, num2 value of 20.0d is passed through the constructor, then printed.
        System.out.println();

        num1 = num2;        //Aliasing - points num1 to num2 in the heap
        num2.setValue(30);  
        System.out.println("The value of num1 ends up as " + num1 + ".");   //num1 has the values of num2, so prints 30
        System.out.println("The value of num2 ends up as " + num2 + ".");   //num2 has value of 30
        System.out.println("The value of num3 ends up as " + num3 + ".");   //num3 still prints old value of num3, which is still 20.

        //num2.value = 45; //should be num2.setValue(45);
    }
}

/* 

   ADD A COMMENT HERE TO EXPLAIN WHY THIS PROGRAM PRODUCES ITS OUTPUT

*/
