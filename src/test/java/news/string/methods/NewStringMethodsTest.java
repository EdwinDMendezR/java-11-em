package news.string.methods;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class NewStringMethodsTest {

    @Test
    public void repaatTest() {
        String repeat = "repeat\n";
        System.out.println(repeat.repeat(4));
    }

    @Test
    public void isBlankTest() {
        String string = "   ";
        Assert.assertTrue(string.isBlank());
        Assert.assertFalse(string.isEmpty());
    }

    @Test
    public void linesTest() {
        String string = "abcdef";
        Stream<String> resultado = string.lines();
        resultado.forEach(System.out::println);
    }

}
