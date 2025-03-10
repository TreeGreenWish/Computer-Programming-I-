public class Circle {
    private double radius;  // Private field to store the radius

    // Constructor that takes radius as a parameter
    public Circle(double r) {
        this.radius = r;
    }

    // Returns the area of the circle (π * r^2)
    public double area() {
        return Math.PI * radius * radius;
    }

    // Returns the circumference of the circle (2 * π * r)
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Returns the radius
    public double getRadius() {
        return radius;
    }

    // Returns string representation of the circle
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1: Circle with radius 2.5
        Circle c1 = new Circle(2.5);
        System.out.println("Circle 1: " + c1.toString());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());

        // Test case 2: Circle with radius 1.0
        Circle c2 = new Circle(1.0);
        System.out.println("\nCircle 2: " + c2.toString());
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.area());
        System.out.println("Circumference: " + c2.circumference());
    }
}