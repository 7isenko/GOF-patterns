package example;

public class ConcreteStateB implements State {

    private final Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("B");
    }
}
