package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;


public class RoomCopyProperites  extends BasePage{

	public RoomCopyProperites(WebDriver driver) {
		
		super(driver);
		
	}
	
	
// locators 
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");
    
    
    private By Rooms = 
    		By.xpath("//button[normalize-space()='Room Tools']");
    
    
    private By CopyProperties =
    		By.cssSelector("div[class='collapse show'] button:nth-child(2)");
    
    
    private By Source = 
    		By.xpath("//select[@formcontrolname='sourceId']");
    
    
    
    private By location = 
    		By.xpath("//select[@id='selectedLocationId']");
    
    
    private By Tags = 
    	By.cssSelector("input.form-check-input");
    
   
    private By Room=
    		By.xpath("//input[@id='e6cd7e8d-b3ca-4ae0-96fe-019fb7f4e5af']");
    
    private By Test =
    		By.xpath("//input[@id='40bdc805-eedd-42b8-b79b-01a01348fc44']");
    
    
    private By Setting = 
    		By.id("setting_LOCATION");
    
    private By Default = 
    		By.id("setting_DEFAULT_DURATION");
    
    private By Capacity = 
    		By.id("setting_CAPACITY");
    
    
    private By equipment = 
    		By.id("setting_EQUIPMENT");
    
    
    private By prepartionontime =
    		
    		By.id("setting_EQUIPMENT");
    
    
    private By checkinsetting =
    		By.id("setting_CHECK_IN_SETTINGS");
    
    
    private By Tags1 =
    		By.id("setting_TAGS");
    
    
    private By Copy = 
    		By.cssSelector("button[type='submit']");
    
    // Methods 
    
    
 public void ClickAdmin() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }
    
    public void ClickTools() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    
  public void ClickRooms() {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(Rooms)).click();
  }
    
    
    
 public void ClickCopyProperties() {
	 
	 wait.until(ExpectedConditions.elementToBeClickable(CopyProperties)).click();
 }
    
    
 public void selectSource(String value) {

	    WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Source)
	    );

	    System.out.println("=================================");
	    System.out.println("Room from config = [" + value + "]");
	    System.out.println("Source dropdown found = " + dropdown.isDisplayed());

	    Select select = new Select(dropdown);

	    System.out.println("Number of options = " + select.getOptions().size());

	    for (WebElement option : select.getOptions()) {
	        System.out.println("OPTION = [" + option.getText().trim() + "]");
	    }

	    System.out.println("=================================");

	    select.selectByVisibleText(value);
	}
 
 
 public void selectlocation(String value) {

	    WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(location)
	    );

	    System.out.println("=================================");
	    System.out.println("Room from config = [" + value + "]");
	    System.out.println("Source dropdown found = " + dropdown.isDisplayed());

	    Select select = new Select(dropdown);

	    System.out.println("Number of options = " + select.getOptions().size());

	    for (WebElement option : select.getOptions()) {
	        System.out.println("OPTION = [" + option.getText().trim() + "]");
	    }

	    System.out.println("=================================");

	    select.selectByVisibleText(value);
	}
 
 
   
   public void enabletags() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Tags));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	}
  

  public void enableRoom() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Room));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
  }
  
  
  
  public void enableTest() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Test));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
  
 
  
  public void enableSetting() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Setting));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
  
  public void enableDefault() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Default));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}

  public void enableCapacity() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Capacity));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}

 
  public void enableEquipment() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(equipment));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
 


  public void enablePrepartionTime() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(prepartionontime));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
  
  

  public void enableCheckinSetting() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(checkinsetting));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
  

  public void enableCheckinTags1() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Tags1));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}

public void ClickCopy() {

	 wait.until(ExpectedConditions.elementToBeClickable(Copy)).click();
}
}
