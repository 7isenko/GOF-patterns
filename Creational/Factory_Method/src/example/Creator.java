package example;

public abstract class Creator {
    public void someMethod(String name) {
        Product product;
        product = factoryMethod(name);
        product.doStuff();
    }

    public abstract Product factoryMethod(String name);
}
