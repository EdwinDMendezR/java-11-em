package nest.based.access.control;

import org.junit.Test;

public class NestBasedAccessControlTest {

    @Test
    public void methodTest() {
        OuterClass outerClass = new OuterClass();
        outerClass.someMethod();
    }

}
