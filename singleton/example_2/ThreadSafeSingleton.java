package singleton.example_2;

public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton threadSafeSingleton;
    
    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    public void singletonTest() {
        System.out.println("Thread Safe Singleton method has been called");
    }

}
