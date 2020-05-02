public class Roger implements Observer {
    private String newspaper;
    private MailSender mailSender;

    public Roger(MailSender mailSender) {
        this.mailSender = mailSender;
        mailSender.registerObserver(this);
    }

    @Override
    public void update(String newspaper, String comics) {
        this.newspaper = newspaper;
        react();
    }

    private void react() {
        System.out.println("I like this fresh newspaper: " + newspaper);
    }
}