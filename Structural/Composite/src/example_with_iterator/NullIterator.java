package example_with_iterator;

import java.util.Iterator;

public class NullIterator implements Iterator<Component> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }
}
