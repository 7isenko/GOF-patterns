package example;

public class Marbles extends AbstractToyDecorator {
    private final BaseToy toy;

    public Marbles(BaseToy toy) {
        this.toy = toy;
    }

    @Override
    public String getName() {
        return toy.getName() + ", all shiny";
    }

    @Override
    public int getBeauty() {
        return toy.getBeauty() + 100;
    }
}
