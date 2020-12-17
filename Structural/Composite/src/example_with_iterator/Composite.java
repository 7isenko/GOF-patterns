package example_with_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Определяет поведение компонентов, имеющих дочерние компоненты, и обеспечивает хранение последних
 */
public class Composite implements Component {
    /**
     * Можно использовать любую подходящую для ваших целей коллекцию
     */
    private final ArrayList<Component> components = new ArrayList<>();
    private Iterator<Component> iterator;

    @Override
    public void operation() {
        System.out.println("operiruem");
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    /**
     * Ориентируйтесь на методы используемой коллекции.
     */
    @Override
    public Component getChild(int num) {
        return components.get(num);
    }

    @Override
    public Iterator<Component> iterator() {
        if (iterator == null){
            iterator = new CompositeIterator(components.iterator());
        }
        return iterator;
    }
}
