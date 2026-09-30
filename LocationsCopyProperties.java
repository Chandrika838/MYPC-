package adminpage;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BasePage;


public class LocationsCopyProperties extends BasePage {

    public LocationsCopyProperties(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By locationTools =
            By.xpath("//button[normalize-space()='Location Tools']");

    private By copyProperties =
            By.xpath("//button[@type='button' and normalize-space()='Copy Properties']");
      
    
    private By target =
            By.id("1f1b01d4-9bdb-4cca-9aa5-01a0472e0183");
    
    private By parentlocation =
    		By.xpath("//input[@id='setting_PARENT_LOCATION']");
    
    private By timezone =
    		By.cssSelector("#setting_TIME_ZONE");
    
    private By WorkingHours = 
    		By.cssSelector("#setting_WORKING_HOURS");
    
    private By copyButton =
            By.xpath("//button[contains(@class,'btn-main')]");

    // Methods

    public void clickAdmin() {

        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {

        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }
    
    public void clickLocationTool() {
        wait.until(
                ExpectedConditions.elementToBeClickable(locationTools)
        ).click();
    }
   
   
    public void clickCopyProperties() {

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(copyProperties)
        );

        button.click();

        System.out.println("========== AFTER COPY PROPERTIES ==========");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Title: " + driver.getTitle());

        // Find every select on the current page
        java.util.List<WebElement> selects =
                driver.findElements(By.tagName("select"));

        System.out.println("Number of SELECT elements = " + selects.size());

        for (int i = 0; i < selects.size(); i++) {

            WebElement select = selects.get(i);

            System.out.println(
                    "SELECT " + i +
                    " | id = " + select.getAttribute("id") +
                    " | name = " + select.getAttribute("name") +
                    " | formcontrolname = " +
                    select.getAttribute("formcontrolname")
            );

            System.out.println(
                    "outerHTML = " + select.getAttribute("outerHTML")
            );
        }

        System.out.println("============================================");
    }
    
    
    	
    public void selectLocation(String locationName) {

        java.util.List<WebElement> selectElements =
                driver.findElements(By.tagName("select"));

        System.out.println(
                "Number of SELECT elements = " + selectElements.size()
        );

        WebElement locationDropdown = null;

        for (WebElement element : selectElements) {

            Select select = new Select(element);

            for (WebElement option : select.getOptions()) {

                if (option.getText().trim()
                        .equalsIgnoreCase(locationName.trim())) {

                    locationDropdown = element;
                    break;
                }
            }

            if (locationDropdown != null) {
                break;
            }
        }

        if (locationDropdown == null) {
            throw new RuntimeException(
                    "Location dropdown containing '" +
                    locationName + "' was not found."
            );
        }

        Select select = new Select(locationDropdown);

        select.selectByVisibleText(locationName.trim());

        System.out.println(
                "Selected location: " + locationName
        );
    }
    
    public void enableTarget() {

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(target)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
  
   
   public void enableParentLocation() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(parentlocation));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
		 
       }
   
   
   public void enableTimeZone() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(timezone));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
		 
       }
   
public void enableWorkingHours() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(WorkingHours));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
   
}
   

    public void clickCopy() {

        wait.until(ExpectedConditions.elementToBeClickable(copyButton)).click();
    }
}