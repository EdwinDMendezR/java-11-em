package news.string.methods;

import org.junit.Assert;
import org.junit.Test;

public class StrinpLeangingTest {

    @Test
    public void stripLeadingTest() {
        String str = "   Hola, mundo ";
        String result = str.stripLeading();
        Assert.assertEquals("Hola, mundo ", result);
    }

    @Test
    public void stripLeadingTest2() {
        String str = "Hola, mundo";
        String result = str.stripLeading();
        Assert.assertEquals("Hola, mundo", result);
    }

    @Test
    public void methodTest() {
        String str = "\u2000\u2001  Hola, mundo";
        String result = str.stripLeading();
        Assert.assertEquals("Hola, mundo", result);
    }

}
