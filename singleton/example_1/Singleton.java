package singleton.example_1;

public class Singleton {

    private static Singleton singleton;

    private static int count = 0;

    public Singleton() {
        System.out.println("Singleten object has created");
    }

    // Double checked Locking design secures thread-safe structure and allows lazy loading
    public static Singleton getSingleton(){

        // If there is threads, this code block assured threads reachs
        // and creates only one singleton object

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        count++;
        System.out.println(count);

        return singleton;
    }
}
