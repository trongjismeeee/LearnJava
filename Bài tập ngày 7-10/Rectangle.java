public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point centrePoint, double width, double height) {
        super(centrePoint);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rectangle: center=" + centerPoint + ",width=" + width + ",height=" + height;
    }
}
