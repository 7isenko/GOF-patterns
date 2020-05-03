public class Dress extends ToyDecorator {
    Toy toy;

    public Dress(Toy toy) {
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
