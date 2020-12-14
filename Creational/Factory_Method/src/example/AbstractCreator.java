package example;

public abstract class AbstractCreator {
    public void someMethod(String name) {
        AbstractProduct product;
        product = factoryMethod(name);
        product.doStuff();
    }

    public abstract AbstractProduct factoryMethod(String name);
}
