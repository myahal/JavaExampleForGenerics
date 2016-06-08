package Container;

import Element.Square;

/**
 * Created by miya on 2016/06/08.
 */
public class BigSquare extends Square {
    public BigSquare(double bottom, double height) {
        super(bottom, height);
        if ( this.bottom < 20.0 || this.height < 20.0 ) {
            this.bottom = 20.0;
            this.height = 20.0;
        }
    }
}
