public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);

        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);

        if (c1.compareTo(c2) > 0) {
            System.out.println("Circle 1 is larger.");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("Circle 2 is larger.");
        } else {
            System.out.println("Both circles are equal in size.");
        }
    }
}
