public class InvokerMultiplied {
    Command[] commands;

    public InvokerMultiplied() {
        int num = 3; // yes
        commands = new Command[num];

        Command noCommand = new NoCommand();
        for (int i = 0; i < num; i++) {
            commands[i] = noCommand;
        }
    }
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }
    public void call(int slot) {
        commands[slot].execute();
    }
}
