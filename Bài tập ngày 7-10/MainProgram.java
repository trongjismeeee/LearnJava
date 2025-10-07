import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 5));
        shapes.add(new Square(new Point(3, 3), 4));
        shapes.add(new Circle(new Point(0, 0), 2.5));

        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());
        System.out.println("\nDanh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
