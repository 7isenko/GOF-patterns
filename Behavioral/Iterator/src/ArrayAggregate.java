import java.util.Iterator;

public class ArrayAggregate implements Iterable<Object> {

    private Object[] array;

    @Override
    public Iterator<Object> iterator() {
        return new ArrayIterator(array);
    }

    // and other methods
    // {
    // ...
    // }

}
