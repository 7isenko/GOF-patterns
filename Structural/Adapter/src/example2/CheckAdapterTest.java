package example2;

public class CheckAdapterTest {
    public static void main(String[] args) {
        ILowerCasePhrases normal = new ConcreteLowerCasePhrases();

        IRandomCaseAloha aloha = new ConcreteRandomCaseAloha();
        IRandomCaseBye bye = new ConcreteRandomCaseBye();
        LowerCasePhrasesAdaptor adaptor = new LowerCasePhrasesAdaptor(aloha, bye);

        System.out.println("check this out");
        testPhrases(normal);
        testPhrases(adaptor);
    }

    private static void testPhrases(ILowerCasePhrases toTest){
        System.out.println(toTest.hello());
        System.out.println(toTest.goodbye());
        System.out.println("===tested===");
    }

    // OUTPUT:
    // check this out
    // hello
    // goodbye
    // ===tested===
    // alohaaaaaaa
    // bye
    // ===tested===

}
