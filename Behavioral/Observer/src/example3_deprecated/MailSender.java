package example3_deprecated;

import java.util.Observable;

public class MailSender extends Observable {
    private String newspaper;
    private String comics;

    public MailSender() {
    }

    public void papersChanged() {
        setChanged();
        notifyObservers();
    }

    public void setPapers(String newspaper, String comics) {
        this.newspaper = newspaper;
        this.comics = comics;
        papersChanged(); // Необязательно оповещать наблюдателей именно таким образом
    }

    public String getNewspaper() {
        return newspaper;
    }

    public String getComics() {
        return comics;
    }
}
