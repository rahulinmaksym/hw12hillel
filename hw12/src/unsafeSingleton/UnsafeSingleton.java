package unsafeSingleton;

public class UnsafeSingleton {

    private static UnsafeSingleton INSTANCE;

    private UnsafeSingleton() {}

    public static UnsafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UnsafeSingleton();
        }
        return INSTANCE;
    }
}
