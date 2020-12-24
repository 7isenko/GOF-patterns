package example;

public class Proxy implements Subject {
    private final Subject subject;

    /**
     * При необходимости заместитель может создавать объект (или управлять созданием (и уничтожением)), а не получать в конструкторе
     * @param subject - вот этот да
     */
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String request() {
        // Реализовывайте как вам нужно, то что ниже - просто заполнитель

        // if тыры пыры пара пыры { туру пуру пара пуру}
        return subject.request();
    }
}
