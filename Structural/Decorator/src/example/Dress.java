package example;

public class Dress extends AbstractToyDecorator {
    private final BaseToy toy;

    public Dress(BaseToy toy) {
        this.toy = toy;
    }

    @Override
    public String getName() {
        return toy.getName() + ", wearing a dress";
    }

    @Override
    public int getBeauty() {
        return toy.getBeauty() + 40;
    }
}
