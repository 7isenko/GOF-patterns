package example;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod(String name) {
        Product product = null;
        if (name.equals("name")) product = new ConcreteProduct();
        else if (name.equals("name2")) product = new ConcreteProduct2(); // And more and more...
        return product;
    }
}
