package example2;

public class SingletonWithoutThreads {
    // Если в вашем приложении нет потоков
    private static SingletonWithoutThreads uniqueInstance;

    private SingletonWithoutThreads() {
    }

    public static SingletonWithoutThreads getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new SingletonWithoutThreads();
        return uniqueInstance;
    }
}
