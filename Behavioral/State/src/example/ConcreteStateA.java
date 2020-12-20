package example;

public class ConcreteStateA implements State{

    private final Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("A");
    }
}
