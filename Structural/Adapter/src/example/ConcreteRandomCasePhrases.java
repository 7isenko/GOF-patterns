package example;

public class ConcreteRandomCasePhrases implements IRandomCasePhrases {
    // in lower case
    @Override
    public String aloha() {
        return "aloha";
    }

    // in upper case
    @Override
    public String bye() {
        return "BYE";
    }

}
