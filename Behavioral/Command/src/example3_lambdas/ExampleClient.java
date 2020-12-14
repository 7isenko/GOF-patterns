package example3_lambdas;

public class ExampleClient {
    public static void main(String[] args) {
        Receiver receiver1 = new Receiver();
        Receiver receiver2 = new Receiver();
        BigReceiver receiver3 = new BigReceiver();

        InvokerMultiplied invoker = new InvokerMultiplied();
        invoker.setCommand(0, receiver1::action);
        invoker.setCommand(1, receiver2::action);
        invoker.setCommand(2, () -> {
            receiver3.action();
            receiver3.action2();
        });

        invoker.call(0);
        invoker.call(1);
        invoker.call(2);
    }
}
