public class ExampleClient {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.call();
        invoker.setCommand(new ConcreteCommand(new Receiver()));
        invoker.call();
    }
}
