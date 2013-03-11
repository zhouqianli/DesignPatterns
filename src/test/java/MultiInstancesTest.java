import design.singleton.BestJavaSingleton;
import design.singleton.JavaSerializableSingleton;
import design.singleton.JavaSingleton;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Test
public class MultiInstancesTest {
    public void testJavaSingleton() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> constructor = JavaSingleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        JavaSingleton instanceOne = (JavaSingleton) constructor.newInstance();
        JavaSingleton instanceTwo = (JavaSingleton) constructor.newInstance();
        Assert.assertEquals(instanceOne == instanceTwo, false);
    }

    public void testJavaSerializableSingleton() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> constructor = JavaSerializableSingleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        JavaSerializableSingleton instanceOne = (JavaSerializableSingleton) constructor.newInstance();
        JavaSerializableSingleton instanceTwo = (JavaSerializableSingleton) constructor.newInstance();
        Assert.assertEquals(instanceOne == instanceTwo, false);
    }

    public void testBestJavaSingleton() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> constructor = BestJavaSingleton.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        BestJavaSingleton instanceOne = (BestJavaSingleton) constructor.newInstance();
        BestJavaSingleton instanceTwo = (BestJavaSingleton) constructor.newInstance();

        // true or false?
        // Assert.assertEquals(instanceOne == instanceTwo, );
    }
}
