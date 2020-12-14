package example;

public class CheckAdapterTest {
    public static void main(String[] args) {
        ILowerCasePhrases normal = new ConcreteLowerCasePhrases();

        IRandomCasePhrases randomCase = new ConcreteRandomCasePhrases();
        LowerCasePhrasesAdaptor adaptor = new LowerCasePhrasesAdaptor(randomCase);

        System.out.println("check this out");
        testPhrases(normal);
        testPhrases(adaptor);
    }

    public static void testPhrases(ILowerCasePhrases toTest){
        System.out.println(toTest.hello());
        System.out.println(toTest.goodbye());
        System.out.println("===tested===");
    }

    // OUTPUT:
    // check this out
    // hello
    // goodbye
    // ===tested===
    // aloha
    // bye
    // ===tested===
}
