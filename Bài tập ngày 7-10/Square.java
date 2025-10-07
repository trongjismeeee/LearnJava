public class Square extends Rectangle {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }

    public String toString() {
        return "Square: center=" + centerPoint + ",side=" + side;
    }
}
