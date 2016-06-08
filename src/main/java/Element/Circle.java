package Element;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
