package example;

public class ConcreteCreator extends AbstractCreator {

    private static final String NAME = "name";
    private static final String NAME2 = "name2";

    @Override
    public AbstractProduct factoryMethod(String name) {
        AbstractProduct product = null;
        if (name.equals(NAME)) {
            product = new ConcreteProduct();
        } else if (name.equals(NAME2)) {
            product = new ConcreteProduct2();
            // And more and more...
        }
        return product;
    }
}
