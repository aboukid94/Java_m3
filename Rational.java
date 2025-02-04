import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator;
    private BigInteger denominator;

    // Default constructor: Rational(0, 1)
    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    // Constructor with BigInteger parameters
    public Rational(BigInteger numerator, BigInteger denominator) {
        if (denominator.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        // Reduce fraction by finding the GCD
        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);
        // Ensure denominator is positive
        if (this.denominator.compareTo(BigInteger.ZERO) < 0) {
            this.numerator = this.numerator.negate();
            this.denominator = this.denominator.negate();
        }
    }

    // Getters for numerator and denominator
    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    // Add two Rational numbers
    public Rational add(Rational second) {
        BigInteger num = this.numerator.multiply(second.denominator)
                .add(second.numerator.multiply(this.denominator));
        BigInteger den = this.denominator.multiply(second.denominator);
        return new Rational(num, den);
    }

    // Subtract two Rational numbers
    public Rational subtract(Rational second) {
        BigInteger num = this.numerator.multiply(second.denominator)
                .subtract(second.numerator.multiply(this.denominator));
        BigInteger den = this.denominator.multiply(second.denominator);
        return new Rational(num, den);
    }

    // Multiply two Rational numbers
    public Rational multiply(Rational second) {
        return new Rational(this.numerator.multiply(second.numerator),
                this.denominator.multiply(second.denominator));
    }

    // Divide two Rational numbers
    public Rational divide(Rational second) {
        return new Rational(this.numerator.multiply(second.denominator),
                this.denominator.multiply(second.numerator));
    }

    @Override
    public int compareTo(Rational o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }

    @Override
    public String toString() {
        return (denominator.equals(BigInteger.ONE)) ? numerator.toString() : numerator + "/" + denominator;
    }

    // Implementing abstract methods from Number class
    @Override
    public int intValue() {
        return numerator.divide(denominator).intValue();
    }

    @Override
    public long longValue() {
        return numerator.divide(denominator).longValue();
    }

    @Override
    public float floatValue() {
        return numerator.divide(denominator).floatValue();
    }

    @Override
    public double doubleValue() {
        return numerator.divide(denominator).doubleValue();
    }
}
