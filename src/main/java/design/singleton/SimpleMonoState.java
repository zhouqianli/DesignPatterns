package design.singleton;

public class SimpleMonoState {
    private static String data;

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        SimpleMonoState.data = data;
    }
}