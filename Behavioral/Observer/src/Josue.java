public class Josue implements Observer {
    private String newspaper;
    private String comics;
    private MailSender mailSender;

    public Josue(MailSender mailSender) {
        this.mailSender = mailSender;
        mailSender.registerObserver(this);
    }

    @Override
    public void update(String newspaper, String comics) {
        this.newspaper = newspaper;
        this.comics = comics;
        react();
    }

    private void react() {
        System.out.println("I like these fresh newspaper: " + newspaper + " and comics: " + comics);
    }
}