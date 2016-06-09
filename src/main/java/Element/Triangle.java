package Element;

public class Triangle implements Shape {
    private double bottom, height;

    public Triangle(double bottom) {
        this.bottom = bottom;
    }

    public double calculateArea() {
        return bottom * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "bottom=" + bottom +
                ", height=" + height +
                '}';
    }
}
