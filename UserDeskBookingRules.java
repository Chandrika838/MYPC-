package adminpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class UserDeskBookingRules extends BasePage {

    public UserDeskBookingRules(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By user =
            By.xpath("//button[normalize-space()='User Tools']");

    private By bookingRule =
            By.cssSelector("div[class='collapse show'] button:nth-child(4)");

    private By DeskPage =
    		By.xpath("//button[normalize-space()='desks']");
    
    private By Tags =
            By.xpath("(//span[@title='Automation Tags'])[2]");
    
    private By access =
            By.id("canAccessIsDefined");
    
    private By Toogle =
    		By.id("canAccess");

    private By maximumPerMonth =
            By.id("maximumNumberOfBookingsPerMonthIsDefined");

    private By maximumBookingDuration =
            By.id("maximumBookingDurationIsDefined");

    private By bookingPerDay =
            By.id("numberOfBookingsPerDayIsDefined");

    private By maximumAllowedPerDay =
            By.id("maximumTimeAllowedPerDayIsDefined");

    private By maximumPeriodAdvance =
            By.id("maxDaysInAdvanceIsDefined");

    private By submit =
            By.cssSelector("button[type='submit']");


    // Methods

    public void clickAdmin() {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    public void clickUser() {
        wait.until(ExpectedConditions.elementToBeClickable(user)).click();
    }

    public void clickBookingRules() {
        wait.until(ExpectedConditions.elementToBeClickable(bookingRule)).click();
    }

    public void clickDeskPage() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(DeskPage));

        element.click();

        /*
         * Wait for the Automation Tags element after opening
         * the Desks page.
         */
        wait.until(
                ExpectedConditions.presenceOfElementLocated(Tags));
    }

  
    public void clickTags() {
        wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();
    }
    
    
    // Access

    public void enableAccess() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(access));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isAccessSelected() {
        return isSelected(access);
    }

    
    public void enableToogle() {
    	
    	   WebElement checkbox = wait.until(
                   ExpectedConditions.elementToBeClickable(Toogle));

           if (!checkbox.isSelected()) {
               checkbox.click();
           }
    }

    
    public boolean isToogleSelected() {
        return isSelected(Toogle);
    }
    // Maximum Per Month

    public void clickMaximumPerMonth() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(maximumPerMonth));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isMaximumPerMonthSelected() {
        return isSelected(maximumPerMonth);
    }


    // Maximum Booking Duration

    public void clickMaximumBookingDuration() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(maximumBookingDuration));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isMaximumBookingDurationSelected() {
        return isSelected(maximumBookingDuration);
    }


    // Booking Per Day

    public void clickBookingPerDay() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(bookingPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isBookingPerDaySelected() {
        return isSelected(bookingPerDay);
    }


    // Maximum Allowed Per Day

    public void clickMaximumAllowedPerDay() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(maximumAllowedPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isMaximumAllowedPerDaySelected() {
        return isSelected(maximumAllowedPerDay);
    }


    // Maximum Period Advance

    public void clickMaximumPeriodAdvance() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(maximumPeriodAdvance));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public boolean isMaximumPeriodAdvanceSelected() {
        return isSelected(maximumPeriodAdvance);
    }


    // Submit

    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
    }

    public boolean isSubmitDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(submit)
        ).isDisplayed();
    }
    
    
 
}