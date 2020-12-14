package example4_java9;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MailSender {
    // it is better to contain a prop change support object than extending the support class
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String newspaper = "init_papers";
    private String comics = "init_comics";

    public void addObserver(String propertyName, PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(propertyName, listener);
    }

    public void setPapers(String newspaper, String comics) {
        pcs.firePropertyChange("newspaper", this.newspaper, newspaper);
        pcs.firePropertyChange("comics", this.comics, comics);

        this.newspaper = newspaper;
        this.comics = comics;
    }

    public String getNewspaper() {
        return newspaper;
    }

    public String getComics() {
        return comics;
    }
}
