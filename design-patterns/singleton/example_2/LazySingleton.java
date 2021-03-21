package singleton.example_2;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void singletonTest() {
        System.out.println("Lazy Singleton method has been called");
    }

}
