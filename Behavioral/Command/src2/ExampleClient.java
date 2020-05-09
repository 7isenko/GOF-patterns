public class ExampleClient {
    public static void main(String[] args) {
        Receiver receiver1 = new Receiver();
        Command command1 = new ConcreteCommand(receiver1);

        Receiver receiver2 = new Receiver();
        Command command2 = new ConcreteCommand(receiver2);

        Receiver receiver3 = new Receiver();
        Command command3 = new ConcreteCommand(receiver3);

        InvokerMultiplied invoker = new InvokerMultiplied();
        invoker.setCommand(0, command1);
        invoker.setCommand(1, command2);
        invoker.setCommand(2,command3);

        invoker.call(0);
        invoker.call(1);
        invoker.call(2);
    }
}
