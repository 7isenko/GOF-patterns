import java.util.ArrayList;

public class MailSender implements Subject {
    private ArrayList observers;
    private String newspaper;
    private String comics;

    public MailSender() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            Observer o = (Observer) observer;
            o.update(newspaper, comics);
        }
    }

    public void papersChanged() {
        notifyObservers();
    }

    public void setPapers(String newspaper, String comics) {
        this.newspaper = newspaper;
        this.comics = comics;
        papersChanged(); // Необязательно оповещать наблюдателей именно таким образом
    }
}
