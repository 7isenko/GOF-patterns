package example2;

public class ConcreteLowerCasePhrases implements ILowerCasePhrases {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String goodbye() {
        return "goodbye";
    }
}
