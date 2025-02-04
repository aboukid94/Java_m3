import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for first rational number
        System.out.print("Enter the first rational number (numerator denominator): ");
        BigInteger num1 = input.nextBigInteger();
        BigInteger den1 = input.nextBigInteger();

        // Prompt user for second rational number
        System.out.print("Enter the second rational number (numerator denominator): ");
        BigInteger num2 = input.nextBigInteger();
        BigInteger den2 = input.nextBigInteger();

        // Create Rational objects
        Rational r1 = new Rational(num1, den1);
        Rational r2 = new Rational(num2, den2);

        // Perform operations and display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
    }
}
