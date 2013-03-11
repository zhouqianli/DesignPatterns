package design.singleton;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public final class DoubleCheckSingleton {
    private DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton getInstance() {
        if (instance == null)
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null)
                    instance = new DoubleCheckSingleton();
            }
        return instance;
    }
}
