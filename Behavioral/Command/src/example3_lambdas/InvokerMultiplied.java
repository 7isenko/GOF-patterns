package example3_lambdas;

public class InvokerMultiplied {
    private final Command[] commands;

    public InvokerMultiplied() {
        int num = 3; // yes
        commands = new Command[num];

        for (int i = 0; i < num; i++) {
            commands[i] = () -> {
            };
        }
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void call(int slot) {
        commands[slot].execute();
    }
}
