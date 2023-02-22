package news.string.methods;

import org.junit.Assert;
import org.junit.Test;

public class NewStringMethodsTest {

    @Test
    public void repaatTest() {
        String repeat = "repeat\n";
        System.out.println(repeat.repeat(4));
    }

    @Test
    public void methodTest() {
        String string = "   ";
        Assert.assertTrue(string.isBlank());
        Assert.assertFalse(string.isEmpty());
    }


}
