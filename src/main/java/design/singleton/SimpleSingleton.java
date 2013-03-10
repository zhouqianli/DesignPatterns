package design.singleton;


import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public final class SimpleSingleton {

    private SimpleSingleton() {
    }

    private SimpleSingleton instance;

    public SimpleSingleton Instance() {
        if (instance == null)
            instance = new SimpleSingleton();
        return instance;
    }
}
