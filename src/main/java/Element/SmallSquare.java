package Element;

import Container.SomeInterface;

/**
 * Created by miya on 2016/06/08.
 */
public class SmallSquare extends Square implements SomeInterface{
    public SmallSquare(double bottom, double height) {
        super(bottom, height);
        if ( bottom > 10.0 || height > 10.0) {
            this.bottom = 10.0;
            this.height = 10.0;
        }
    }
}
