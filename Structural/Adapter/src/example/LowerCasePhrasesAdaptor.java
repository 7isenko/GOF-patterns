package example;

public class LowerCasePhrasesAdaptor implements ILowerCasePhrases {
    private final IRandomCasePhrases notOkClass;

    public LowerCasePhrasesAdaptor(IRandomCasePhrases notOkClass) {
        this.notOkClass = notOkClass;
    }

    @Override
    public String hello() {
        // it is fine
        return notOkClass.aloha();
    }

    @Override
    public String goodbye() {
        // oh shit! it is upper case word
        return notOkClass.bye().toLowerCase();
    }
}
