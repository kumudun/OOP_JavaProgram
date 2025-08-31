package ShapeColour;

public class Shape {
    protected String color;  // common property

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Basic Shape, color: " + color;
    }
}

