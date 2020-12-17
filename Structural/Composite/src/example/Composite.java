package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Определяет поведение компонентов, имеющих дочерние компоненты, и обеспечивает хранение последних
 */
public class Composite implements Component {

    /**
     * Можно использовать любую подходящую для ваших целей коллекцию
     */
    private final ArrayList<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("hello ma children");
        components.forEach(Component::operation);
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
}
