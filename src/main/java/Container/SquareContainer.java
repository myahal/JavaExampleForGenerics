package Container;

import Element.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by miya on 2016/06/08.
 */
//public class SquareContainer<T extends Square & SomeInterface> {
public class SquareContainer<T extends Square> {
    private List<T> container = new ArrayList<T>();

    public void put(T element) {
        container.add(element);
    }

    public T get(int index) {
        if ( container.size() <= index )  {
            return null;
        }
        else
            return container.get(index);
    }

    public Stream<T> getStream() {
        return container.stream();
    }

    public double calcSomething(Function<SquareContainer, List> convertor) {
        List<Double> result = convertor.apply(this);
        return result.stream().reduce(0.0, (base, value) -> base + value);
    }

}
