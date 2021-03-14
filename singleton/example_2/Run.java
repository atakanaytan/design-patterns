package singleton.example_2;

public class Run {

    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getInstance().singletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();

        BillPughSingleton.getInstance().singletonTest();
    }
}
