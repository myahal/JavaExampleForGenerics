import Container.ShapeContainer;
import Container.SquareContainer;
import Element.Circle;
import Element.SmallSquare;
import Element.Square;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        ShapeContainer<Circle> c1 = new ShapeContainer<Circle>();
        c1.put(new Circle(10.0));
        c1.put(new Circle(20.0));

        ShapeContainer<SmallSquare> c2 = new ShapeContainer<SmallSquare>();
        c2.put(new SmallSquare(5.0, 2.0));
        // c2.put(new Square(10.0, 20.0)); -> ジェネリクスは共変ではない

        SquareContainer c3 = new SquareContainer<Square>();
        c3.put(new Square(20.0, 10.0));

        SquareContainer c4 = new SquareContainer<SmallSquare>();
        c4.put(new SmallSquare(5.0, 2.0));
        c4.put(new SmallSquare(2.0, 3.0));

        // SquareContainer c5 = new SquareContainer<Triangle>(); 上限境界

        Function<SquareContainer<Square>, List> lambda01 =
                (container) -> container
                        .getStream()
                        .map(e -> e.getBottom())
                        .collect(Collectors.toList());
        System.out.println(c4.calcSomething(lambda01));
        System.out.println(c4.max(lambda01));
    }
}
