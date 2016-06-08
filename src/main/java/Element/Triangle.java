package Element;

/**
 * Created by miya on 2016/06/08.
 */
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
