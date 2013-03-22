package design.singleton;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class LazyLoadJavaSingleton {
    private LazyLoadJavaSingleton() {
    }

    private static class LazyHolder {
        private static final LazyLoadJavaSingleton INSTANCE = new LazyLoadJavaSingleton();
    }

    public static LazyLoadJavaSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

}
