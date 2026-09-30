package testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

@Listeners(ExtentListener.class)
public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        config = new ConfigReader();

        driver.manage().window().maximize();

        driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(20));

        driver.get(config.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

 

