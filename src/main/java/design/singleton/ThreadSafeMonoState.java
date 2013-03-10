package design.singleton;

public class ThreadSafeMonoState {
    private volatile static String data;

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        ThreadSafeMonoState.data = data;
    }
}
