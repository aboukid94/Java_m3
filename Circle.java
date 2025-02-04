public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
        this(1.0); // Default radius 1.0
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}
