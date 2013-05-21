package design.singleton;


import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public final class SimpleSingleton {

    private SimpleSingleton() {
    }

    private SimpleSingleton instance;

    public SimpleSingleton getInstance() {
        if (instance == null)
            instance = new SimpleSingleton();
        return instance;
    }
}
