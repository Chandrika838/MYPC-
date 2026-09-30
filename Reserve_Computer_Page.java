package adminpage;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;


public class Reserve_Computer_Page extends BasePage {

	public Reserve_Computer_Page(WebDriver driver) {
		
		super(driver);

	}
	
	
// locators 
	
 private By reserve = 
		 By.xpath("//span[normalize-space()='Reserve']");
 
 private By computer = 
		 By.xpath("//span[contains(text(),'Computers')]");

 private By location = 
          By.xpath("//select[@id='selectedLocationId']");
 
 private By datePicker = 
		 By.cssSelector("span[role='button']");
        
 private By nextButton = 
		 By.xpath("//button[@aria-label='Next month']");
 

 private By MonthYear = 
		 By.xpath("//div[@class='ngb-dp-month-name']");
 
 
 private By Tooltips =
		By.cssSelector("div[role='button']");
				      
 
 private By StartTime2 = 
		 By.xpath("//app-time-selector[@formcontrolname='startTime']//select");
 
 private By SelfBookings = 
		 By.id("selfBooking");
 
 
// private By Recurrence = 
		// By.xpath("//div[@id='recurring-options']//span[1]");
 
 
 //private By Booking =
	//	 By.xpath("//select[@formcontrolname='recurringType']");
 
// private By Update = 
		// By.xpath("//button[normalize-space()='Update']");
		 
 private By Books = 
		 By.xpath("//button[@type='submit']");
 
 
 // Methods 
 
 
 public void ClickReserve() {
	 
		wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();
	 
 }
 
 
public void ClickComputer() {

	wait.until(ExpectedConditions.elementToBeClickable(computer)).click();
	
}
 
public void SelectLocation(String value) {

    WebElement dropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(location));

    Select select = new Select(dropdown);

    wait.until(driver ->
            select.getOptions().size() > 1);

    System.out.println("Location Value = " + value);

    for(WebElement option : select.getOptions()) {
        System.out.println("Dropdown Option = " + option.getText());
    }

    select.selectByVisibleText(value);
}



public boolean isDisplayedLocation() {
	
	return isDisplayed(location);
}

public void selectDate(LocalDate bookingDate) {

    // Open Calendar
    wait.until(ExpectedConditions.elementToBeClickable(datePicker)).click();

    String expectedMonthYear =
            bookingDate.getMonth()
                    .getDisplayName(TextStyle.SHORT, Locale.ENGLISH)
                    + " "
                    + bookingDate.getYear();

    String expectedDay = String.valueOf(bookingDate.getDayOfMonth());

    int attempts = 0;

    while (attempts < 24) {

        String currentMonthYear = wait.until(
                ExpectedConditions.visibilityOfElementLocated(MonthYear)
        ).getText().trim();

        System.out.println("Current Month : " + currentMonthYear);
        System.out.println("Expected Month : " + expectedMonthYear);

        if (currentMonthYear.equals(expectedMonthYear)) {
            break;
        }

        wait.until(
                ExpectedConditions.elementToBeClickable(nextButton)
        ).click();

        attempts++;
    }

    if (attempts >= 24) {
        throw new RuntimeException(
                "Could not find booking month: " + expectedMonthYear
        );
    }
    By day = By.xpath(
            "//div[contains(@class,'ngb-dp-day')" +
            " and not(contains(@class,'disabled'))]" +
            "[normalize-space()='" + expectedDay + "']"
    );

    wait.until(ExpectedConditions.elementToBeClickable(day)).click();
}

	
public void clickToolTip() {
	
    WebElement tooltipElement = wait.until(
            ExpectedConditions.refreshed(
                    ExpectedConditions.elementToBeClickable(Tooltips)));

    tooltipElement.click();
    
    
}


public void ClickTooltips() {

    int attempts = 0;

    while (attempts < 3) {
        try {
            WebElement slot = wait.until(
                    ExpectedConditions.elementToBeClickable(Tooltips));

            slot.click();
            return;

        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            attempts++;
        }
    }

    throw new RuntimeException("Unable to click tooltip after retries");
}



public boolean isDisplayedTooltips() {
	
	return isDisplayed(Tooltips);
	
}


public void SelectStartTime2(String value) {
	
	 WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(StartTime2));

	    // Wait until the dropdown is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

	    // Create Select object
	    Select select = new Select(dropdown);

	    
	    // Select the value
	    select.selectByVisibleText(value);
}




public void EnableSelfBookings() {
	
	WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(SelfBookings));
	
	if(!checkbox.isSelected()) {
		checkbox.click();
	}
}


public boolean isSelectedSelfBooking() {
	
	return isSelected(SelfBookings);
	
}


//public void Recurrence() {
	
//wait.until(ExpectedConditions.elementToBeClickable(Recurrence)).click();

//}

/*public void selectBooking(String value ) {
	
	 WebElement dropdown1 = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Booking));
	
	 Select select = new Select(dropdown1);
	 
	 select.selectByVisibleText(value);
	 
}

*/

/*	public void ClickUpdate() {

	    WebElement updateBtn = wait.until(
	            ExpectedConditions.elementToBeClickable(Update));

	    updateBtn.click();
	}

	
	*/

public void ClickBooks() {
	
	click(Books);
	

}

public boolean isDisplayedBooks() {
	
	return isDisplayed(Books);
}
}
 
 
 
 
 
 
 
		

