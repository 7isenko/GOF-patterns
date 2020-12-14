package example2;

public class LowerCasePhrasesAdaptor implements ILowerCasePhrases {
    private final IRandomCaseAloha aloha;
    private final IRandomCaseBye bye;

    public LowerCasePhrasesAdaptor(IRandomCaseAloha aloha, IRandomCaseBye bye) {
        this.aloha = aloha;
        this.bye = bye;
    }

    @Override
    public String hello() {
        // it is fine
        return aloha.aloha().toLowerCase();
    }

    @Override
    public String goodbye() {
        // oh shit! it is upper case word
        return bye.bye().toLowerCase();
    }
}
