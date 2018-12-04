package intTests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;

import java.io.File;

@Category(IntegrationTest1.class)

public class IntegrationTest1 {
    @Test

    public void TestTitle1() {

        File src = new File("/usr/local/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.10.22:8080/AMGrads");
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.contains("MyApp"));


    }
}
