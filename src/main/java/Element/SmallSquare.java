package Element;

import Container.SomeInterface;

public class SmallSquare extends Square implements SomeInterface{
    public SmallSquare(double bottom, double height) {
        super(bottom, height);
        if ( bottom > 10.0 || height > 10.0) {
            this.bottom = 10.0;
            this.height = 10.0;
        }
    }
}
