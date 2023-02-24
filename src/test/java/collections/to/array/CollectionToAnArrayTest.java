package collections.to.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CollectionToAnArrayTest {

    @Test
    public void arraysAsList() {
        List<String> lista = Arrays.asList("hola", "mundo", "en", "Java");
        String[] arreglo = lista.toArray(new String[0]);
        Assert.assertEquals(4, arreglo.length);
    }

    @Test
    public void arraysAsList1() {
        List<String> lista = Arrays.asList("hola", "mundo", "en", "Java");
        String[] arreglo = lista.toArray(new String[1]);
        Assert.assertEquals(4, arreglo.length);
    }


}
