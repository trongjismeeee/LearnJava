public class Circle extends Shape {
    private double radius;

    public Circle(Point centrePoint, double radius) {
        super(centrePoint);
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Circle: center=" + centerPoint + ",radius=" + radius;
    }
}