package example;

public class ProductA1 implements AbstractProductA {
    String name = "Product A1";

    @Override
    public String getName() {
        return this.name;
    }
}
