package example2;

public class Roger implements Observer {
    private String newspaper;
    private MailSender mailSender;

    public Roger(MailSender mailSender) {
        this.mailSender = mailSender;
        mailSender.registerObserver(this);
    }

    @Override
    public void update() {
        this.newspaper = mailSender.getNewspaper();
        react();
    }

    private void react() {
        System.out.println("I like this fresh newspaper: " + newspaper);
    }
}