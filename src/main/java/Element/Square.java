package Element;

/**
 * Created by miya on 2016/06/08.
 */
public class Square implements Shape {
    protected double bottom, height;

    public Square(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return bottom * height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "bottom=" + bottom +
                ", height=" + height +
                '}';
    }
}
