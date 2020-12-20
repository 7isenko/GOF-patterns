package example;

/**
 * Context - это тот самый объект с несколькими состояниями
 */
public class Context {
    private final State stateA;
    private final State stateB;
    private final State stateC;

    private State state;

    public Context() {
        this.stateA = new ConcreteStateA(this);
        this.stateB = new ConcreteStateB(this);
        this.stateC = new ConcreteStateC(this);

        state = stateA;
    }

    /**
     * Действия с Context делегируются объектам состояний
     */
    public void request() {
        state.handle();
    }

    /**
     * Вызывается внутри #handle() из состояний или прямо в контексте в зависимости от того, динамична ли природа состояний или статична соответственно.
      * @param state получается getter'om, которые расположены ниже
     */
    public void setState(State state) {
        this.state = state;
    }

    public State getStateA() {
        return stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public State getStateC() {
        return stateC;
    }
}
