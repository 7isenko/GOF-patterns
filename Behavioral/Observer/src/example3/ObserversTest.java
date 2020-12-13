package example3;

public class ObserversTest {
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Roger roger = new Roger(mailSender);
        Josue josue = new Josue(mailSender);

        mailSender.setPapers("Time 01.05.20", "Spoody-Moo");
        mailSender.setPapers("Time 02.06.20", "BudMan");
        mailSender.setPapers("Time 03.07.20", "Captain Germany");

        // output:
        // I like these fresh newspaper: Time 01.05.20 and comics: Spoody-Moo
        // I like this fresh newspaper: Time 01.05.20
        // I like these fresh newspaper: Time 02.06.20 and comics: BudMan
        // I like this fresh newspaper: Time 02.06.20
        // I like these fresh newspaper: Time 03.07.20 and comics: Captain Germany
        // I like this fresh newspaper: Time 03.07.20
    }
}
