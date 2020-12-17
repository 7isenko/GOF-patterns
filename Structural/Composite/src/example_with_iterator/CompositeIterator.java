package example_with_iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * та за шо мне этот внешний итератор-то а?
 */
public class CompositeIterator implements Iterator<Component> {

    Stack<Iterator<Component>> stack = new Stack<>();

    public CompositeIterator(Iterator<Component> iterator) {
        stack.push(iterator);
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();

            stack.push(component.iterator());

            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<Component> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
