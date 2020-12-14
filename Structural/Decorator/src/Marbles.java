public class Marbles extends ToyDecorator {
    private final Toy toy;

    public Marbles(Toy toy) {
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
