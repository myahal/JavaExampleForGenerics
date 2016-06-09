package Element;

public class BigSquare extends Square {
    public BigSquare(double bottom, double height) {
        super(bottom, height);
        if ( this.bottom < 20.0 || this.height < 20.0 ) {
            this.bottom = 20.0;
            this.height = 20.0;
        }
    }
}
