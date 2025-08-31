package ShapeColour;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");

        Shape[] shapes = {
                new Circle(6.0, "Red"),
                new Rectangle(5.0, 8.0, "Blue"),
                new Triangle(4.0, 8.0, "Green")
        };

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }
    }
}

