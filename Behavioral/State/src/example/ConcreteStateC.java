package example;

public class ConcreteStateC implements State {

    private final Context context;

    public ConcreteStateC(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("default");
    }
}
