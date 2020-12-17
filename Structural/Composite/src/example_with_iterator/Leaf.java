package example_with_iterator;

import java.util.Iterator;

/**
 * Определяет поведение элементов комбинации
 */
public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("doing business");
    }

    @Override
    public Iterator<Component> iterator() {
        return new NullIterator();
    }
}
