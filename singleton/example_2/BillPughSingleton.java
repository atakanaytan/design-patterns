package singleton.example_2;

import singleton.example_1.Singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public void singletonTest() {
        System.out.println("Bill Pugh Singleton method has been called");
    }
}
