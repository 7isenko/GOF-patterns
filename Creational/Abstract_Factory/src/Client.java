public class Client {
    // Код клиента пишется для абстрактной фабрики, а затем во время выполнения связывается с реальной фабрикой
    private AbstractFactory af;
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory af) {
        this.af = af;
    }

    public void createProducts() {
        productA = af.createProductA();
        productB = af.createProductB();
    }

    public void cookProducts() {
        System.out.println("nice salad made with " + productA.getName() + " and " + productB.getName());
    }

    public void changeFactory(AbstractFactory factory) {
        this.af = factory;
    }
}
