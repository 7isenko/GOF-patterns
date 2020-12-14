package example;

public class Pony extends ToyDecorator {
    private final Toy toy;

    public Pony(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String getName() {
        return toy.getName() + ", on a pony";
    }

    @Override
    public int getBeauty() {
        return toy.getBeauty() + 1000;
    }
}
