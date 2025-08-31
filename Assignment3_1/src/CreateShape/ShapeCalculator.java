package CreateShape;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");

        Shape[] shapes = {
                new Circle(6.0),
                new Rectangle(5.0, 8.0),
                new Triangle(4.0, 8.0)
        };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }
    }
}

