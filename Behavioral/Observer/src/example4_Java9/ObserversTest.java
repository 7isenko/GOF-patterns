package example4_Java9;

public class ObserversTest {

    // <3 https://gist.github.com/mtorchiano/e69ac7e309fee81bd17f4f0740b9ffa9 <3

    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        John john = new John();
        Josue josue = new Josue();
        mailSender.addObserver("newspaper", john);
        mailSender.addObserver("newspaper", josue);
        mailSender.addObserver("comics", josue);

        mailSender.setPapers("Time 01.05.20", "Spoody-Moo");
        mailSender.setPapers("Time 02.06.20", "BudMan");
        mailSender.setPapers("Time 03.07.20", "Captain Germany");

        // output:
        // John: I like this fresh newspaper: Time 01.05.20
        // Josue: I like this fresh newspaper: Time 01.05.20
        // Josue: I like this fresh comics: Spoody-Moo
        // John: I like this fresh newspaper: Time 02.06.20
        // Josue: I like this fresh newspaper: Time 02.06.20
        // Josue: I like this fresh comics: BudMan
        // John: I like this fresh newspaper: Time 03.07.20
        // Josue: I like this fresh newspaper: Time 03.07.20
        // Josue: I like this fresh comics: Captain Germany

    }
}
