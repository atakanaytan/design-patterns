package singleton.example_2;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    private EagerInitializationSingleton() {

    }

    public void singletonTest() {
        System.out.println("Singleton method has been called");
    }
}
