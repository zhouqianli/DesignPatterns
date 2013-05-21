package design.singleton;

import net.jcip.annotations.ThreadSafe;

import java.io.Serializable;

@ThreadSafe
public class JavaSerializableSingleton implements Serializable {
    public static final JavaSerializableSingleton INSTANCE = new JavaSerializableSingleton();

    private JavaSerializableSingleton() {
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
