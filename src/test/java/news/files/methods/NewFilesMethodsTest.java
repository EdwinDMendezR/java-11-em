package news.files.methods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;

public class NewFilesMethodsTest {

    ClassLoader resources;
    File file1;
    File file2;

    @Before
    public void setUp() throws URISyntaxException {
        resources = NewFilesMethodsTest.class.getClassLoader();
        file1 = new File(resources.getResource("file1.txt").toURI());
        file2 = new File(resources.getResource("file2.txt").toURI());
    }

    @Test
    public void filesisSameFileTestTrue() throws URISyntaxException, IOException {
        Assert.assertTrue(Files.isSameFile(file1.toPath(), file1.toPath()));
    }

    @Test
    public void filesisSameFileTest2() throws URISyntaxException, IOException {
        Assert.assertFalse(Files.isSameFile(file1.toPath(), file2.toPath()));
    }

    @Test
    public void fileToPathTest() {
        Assert.assertEquals(
                "D:\\repositorios\\java-11-em\\build\\resources\\test\\file1.txt",
                file1.toPath().toString());
    }

}
