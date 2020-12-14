package example1;

public class Invoker {
    private Command slot;

    public Invoker(Command slot) {
        this.slot = slot;
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void call() {
        slot.execute();
    }
}
