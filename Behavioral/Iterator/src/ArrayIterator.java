import java.util.Iterator;

public class ArrayIterator implements Iterator<Object> {

    private final Object[] array;
    private int position = 0;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length && array[position] != null;
    }

    @Override
    public Object next() {
        Object obj = array[position];
        position++;
        return obj;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Нельзя удалять элементы, если ни разу не был вызван next()");
        }
        if (array[position - 1] != null) {
            //noinspection ManualArrayCopy
            for (int i = position - 1; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = null;
        }
    }
}
