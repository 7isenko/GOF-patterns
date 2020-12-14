package example4_java9;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class John implements PropertyChangeListener {
    private String newspaper;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("newspaper".equals(evt.getPropertyName())) {
            this.newspaper = (String) evt.getNewValue();
        } else throw new IllegalStateException("Unexpected value: " + evt.getPropertyName());
        react();
    }

    private void react() {
        System.out.println("John: I like this fresh newspaper: " + newspaper);
    }


}