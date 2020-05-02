import java.util.Observable;
import java.util.Observer;

public class Roger implements Observer {
    private String newspaper;
    private Observable observable;

    public Roger(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MailSender) {
            MailSender mailSender = (MailSender) o;
            this.newspaper = mailSender.getNewspaper();
            react();
        }
    }

    private void react() {
        System.out.println("I like this fresh newspaper: " + newspaper);
    }
}