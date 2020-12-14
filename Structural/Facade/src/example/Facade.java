package example;

public class Facade {
    private final Component1 component1;
    private final Component2 component2;

    public Facade(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    public void doSomethingCool() {
        component1.act1();
        component2.act2();
        component1.act3();
        component2.act4();
        component1.act5();
    }

    public void doSomethingCooler() {
        component2.act1();
        component1.act2();
        component2.act3();
        component1.act4();
        component2.act5();
    }


}
