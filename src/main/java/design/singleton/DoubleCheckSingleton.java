package design.singleton;


public final class DoubleCheckSingleton {
    private DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton Instance() {
        if (instance == null)
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null)
                    instance = new DoubleCheckSingleton();
            }
        return instance;
    }
}
