package news.string.methods;

import org.junit.Assert;
import org.junit.Test;

public class StripTest {

    @Test
    public void stripTest() {
        String str = "   Hello, World!   ";
        String stripped = str.strip();
        Assert.assertEquals("Hello, World!", stripped);
    }

    @Test
    public void stripTest2() {
        String str = "\u2005\u2004Hello, World!\u2002\u2001";
        String stripped = str.strip();
        Assert.assertEquals("Hello, World!", stripped);
    }

    @Test
    public void stripTest3() {
        String str = "";
        String stripped = str.strip();
        Assert.assertEquals("", stripped);
    }

    @Test
    public void stripTest4() {
        try {
            String str = null;
            String stripped = str.strip();
        } catch (Exception e) {
            Assert.assertEquals("java.lang.NullPointerException", e.toString());
        }
    }
}
