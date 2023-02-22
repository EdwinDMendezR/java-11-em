package news.string.methods;

import org.junit.Assert;
import org.junit.Test;

public class StripTrailingTest {

    @Test
    public void stripTrailingTest() {
        String str = "  Hola Mundo   ";
        String strSinEspaciosFinales = str.stripTrailing();
        Assert.assertEquals("  Hola Mundo", strSinEspaciosFinales);
    }

    @Test
    public void stripTrailingTest2() {
        String str = "Hola Mundo\n\n\n";
        String strSinNuevasLineasFinales = str.stripTrailing();
        Assert.assertEquals("Hola Mundo", strSinNuevasLineasFinales);
    }

    @Test
    public void methodTest() {
        String str = "Hola Mundo  ";
        str = str.stripTrailing();
        Assert.assertEquals("Hola Mundo", str);
    }

}
