import Container.*;
import Element.Circle;
import Element.SmallSquare;
import Element.Square;
import Element.Triangle;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by miya on 2016/06/08.
 */
public class MainClass {
    public static void main(String[] args) {
        ShapeContainer<Circle> c1 = new ShapeContainer<Circle>();
        c1.put(new Circle(10.0));
        c1.put(new Circle(20.0));
        System.out.println(c1.get(1));

        ShapeContainer<SmallSquare> c2 = new ShapeContainer<SmallSquare>();
        c2.put(new SmallSquare(5.0, 2.0));
        // c2.put(new Square(10.0, 20.0)); -> ジェネリクスは共変ではない

        //SquareContainer c3 = new SquareContainer<Square>(); 上限境界
        //c3.put(new Square(20.0, 10.0));

        SquareContainer c4 = new SquareContainer<SmallSquare>();
        c4.put(new SmallSquare(5.0, 2.0));
        c4.put(new SmallSquare(2.0, 3.0));


        Function<SquareContainer<Square>, List> lambda01 = (container) -> container.getStream().map(e -> e.getBottom()).collect(Collectors.toList());
        // SquareContainer c5 = new SquareContainer<Triangle>(); 上限境界
        System.out.println(c4.calcSomething(lambda01));
    }
}
