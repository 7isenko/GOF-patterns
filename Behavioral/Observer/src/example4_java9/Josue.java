package example4_java9;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Josue implements PropertyChangeListener {
    private String newspaper = "init_papers";
    private String comics = "init_comics";

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case "newspaper" -> this.newspaper = (String) evt.getNewValue();
            case "comics" -> this.comics = (String) evt.getNewValue();
            default -> throw new IllegalStateException("Observer do not support the property named: " + evt.getPropertyName());
        }
        react(evt.getPropertyName());
    }


    private void react(String propertyName) {
        switch (propertyName) {
            case "newspaper" ->  System.out.println("Josue: I like this fresh newspaper: " + newspaper);
            case "comics" -> System.out.println("Josue: I like this fresh comics: " + comics);
            default -> throw new IllegalStateException("Observer do not support the property named: " + propertyName);
        }
    }

}