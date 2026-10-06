package hookclass;

import org.openqa.selenium.WebDriver;

import automation.pages.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {

    public static WebDriver driver;

    @Before
    public void setUp() {

        DriverFactory.startDriver();

        driver = DriverFactory.getDriver();
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();

        driver = null;
    }
}
