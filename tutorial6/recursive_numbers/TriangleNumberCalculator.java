import java.util.Scanner;

public class TriangleNumberCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int number = scan.nextInt();
        long result = triangularNumber(number);
        System.out.println("The sum from 1 to " + number + " is " + result);
    }

    public static long triangularNumber(int n){
        //base case
        if(n == 1) return 1l;
        //standard case
        else return n + triangularNumber(n - 1);
    }
}