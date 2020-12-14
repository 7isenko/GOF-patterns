package example;

public class Test {
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        creator.someMethod("name");
        creator.someMethod("name2");
        // output:
        // Super Stuff
        // Super-Puper Stuff
    }
}
