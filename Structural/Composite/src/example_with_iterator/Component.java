package example_with_iterator;

public interface Component extends Iterable<Component> {
    void operation();

    default void addComponent(Component component) {
        throw new UnsupportedOperationException("this element does not support that method");
    }

    default void removeComponent(Component component) {
        throw new UnsupportedOperationException("this element does not support that method");
    }

    default Component getChild(int num) {
        throw new UnsupportedOperationException("this element does not support that method");
    }
}
