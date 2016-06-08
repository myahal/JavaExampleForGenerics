package Container;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T> {
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
}
