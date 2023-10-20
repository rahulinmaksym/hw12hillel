package safeSingleton;

public class SafeSingleton {

    private SafeSingleton() {}

    private static class SingletonHolder {
        public static final SafeSingleton HOLDER_INSTANCE = new SafeSingleton();
    }

    public static SafeSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
