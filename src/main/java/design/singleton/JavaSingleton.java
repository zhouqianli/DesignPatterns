package design.singleton;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class JavaSingleton {
    public static final JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton() {
    }
}
