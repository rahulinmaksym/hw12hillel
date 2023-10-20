import safeSingleton.SafeSingleton;
import unsafeSingleton.UnsafeSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(SafeSingleton.getInstance());
        System.out.println(UnsafeSingleton.getInstance());
        System.out.println(SafeSingleton.getInstance());
        System.out.println(UnsafeSingleton.getInstance());
        System.out.println(SafeSingleton.getInstance());
        System.out.println(UnsafeSingleton.getInstance());
        System.out.println(SafeSingleton.getInstance());
        System.out.println(UnsafeSingleton.getInstance());
    }
}
