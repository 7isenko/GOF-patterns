package example3;

import java.util.Observable;
import java.util.Observer;

public class Josue implements Observer {
    private String newspaper;
    private String comics;
    private Observable observable;

    public Josue(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MailSender) {
            MailSender mailSender = (MailSender) o;
            this.newspaper = mailSender.getNewspaper();
            this.comics = mailSender.getComics();
            react();
        }
    }

    private void react() {
        System.out.println("I like these fresh newspaper: " + newspaper + " and comics: " + comics);
    }
}