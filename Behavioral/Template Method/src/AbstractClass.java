public abstract class AbstractClass {

    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        commonOperation();
        hook();
    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public final void commonOperation() {
        System.out.println("hello");
    }

    /**
     * Это перехватчик. Его можно _переопределять_ в субклассах в случае необходимости.
     * Может называться иначе.
     * Может быть пустым, может иметь функционал по-умолчанию.
     * Может быть несколько.
     */
    public void hook() {
    }

}
