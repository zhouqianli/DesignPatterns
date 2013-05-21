package design.singleton;


import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class JavaDoubleCheckSingleton {
    @GuardedBy("this")
    private JavaDoubleCheckSingleton instance;

    private JavaDoubleCheckSingleton() {
    }

    public synchronized JavaDoubleCheckSingleton getInstance() {
        if (instance == null)
            instance = new JavaDoubleCheckSingleton();
        return instance;
    }
}
