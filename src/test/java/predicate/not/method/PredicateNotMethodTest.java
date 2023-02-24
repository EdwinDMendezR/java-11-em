package predicate.not.method;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class PredicateNotMethodTest {

    @Test
    public void methodTest() {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = Predicate.not(isEven);
        Assert.assertTrue(isOdd.test(5));
        Assert.assertFalse(isOdd.test(10));
    }

}
