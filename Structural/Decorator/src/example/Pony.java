package example;

public class Pony extends AbstractToyDecorator {
    private final BaseToy toy;

    public Pony(BaseToy toy) {
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
