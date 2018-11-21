package intTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;

import java.io.File;
@Category(IntegrationTest.class)

public class IntegrationTest {
    @Test

    public void TestTitle1() {

        File src = new File("/usr/local/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.39.31:8989/AMGrads");
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.contains("MyApp"));


    }
}
