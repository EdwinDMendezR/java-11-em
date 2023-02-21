package dinamic.classes.file.constants;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;

public class DynamicClassFileConstantsTest {

    public static final String MY_CONSTANT = new String(
            new byte[] {69, 100, 119, 105, 110, 32, 77, 101, 110, 100, 101, 122},
            Charset.defaultCharset()
    );

    @Test
    public void methodTest() {
        Assert.assertEquals("Edwin Mendez", MY_CONSTANT);
    }
}
