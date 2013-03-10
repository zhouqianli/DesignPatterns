package design.singleton;


public class JavaDoubleCheckSingleton {
    private JavaDoubleCheckSingleton instance;

    private JavaDoubleCheckSingleton() {
    }

    public synchronized JavaDoubleCheckSingleton Instance() {

        if (instance == null)
            instance = new JavaDoubleCheckSingleton();
        return instance;
    }
}
