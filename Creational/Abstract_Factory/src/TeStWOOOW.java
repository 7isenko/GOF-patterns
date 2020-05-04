public class TeStWOOOW {
    public static void main(String[] args) {
        // Я набыдлокодил во всем примере. Просите.
        AbstractFactory factory1 = new Factory1();
        Client client = new Client(factory1);
        client.createProducts();
        client.cookProducts();

        AbstractFactory factory2 = new Factory2();
        client.changeFactory(factory2);
        client.createProducts();
        client.cookProducts();

        // output:
        // nice salad made with Product A1 and Product B1
        // nice salad made with Product A2 and Product B2
    }
}
