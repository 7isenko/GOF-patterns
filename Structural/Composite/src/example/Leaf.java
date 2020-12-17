package example;

import java.util.Collection;

/**
 * Определяет поведение элементов комбинации
 */
public class Leaf implements Component{

    @Override
    public void operation() {
        System.out.println("doing business");
    }
}
