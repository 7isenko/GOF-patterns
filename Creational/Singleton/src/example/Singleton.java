package example;

public class Singleton {
    // Хорошая реализация для мультипоточного приложения .
    // Плохо работает в версиях Java 1.4 и раньше!
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
