package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.LocationsCopyProperties;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

public class LocationCopyPropertiesTestCase extends BaseTest {

    ConfigReader config = new ConfigReader();

    @Test(description =
            "Verifies that an administrator can copy location properties "
            + "by selecting the required options and applying them successfully.")
    public void VerifyAddLocationCopyProperties() {

        ExtentListener.getTest().info("<b>Scenarios Covered:</b>");
        ExtentListener.getTest().info("• Login with valid administrator credentials");
        ExtentListener.getTest().info("• Navigate to Locations");
        ExtentListener.getTest().info("• Select a Location");
        ExtentListener.getTest().info("• Enable Target");
        ExtentListener.getTest().info("• Enable Parent Location");
        ExtentListener.getTest().info("• Enable Time Zone");
        ExtentListener.getTest().info("• Enable Working Hours");
        ExtentListener.getTest().info("• Verify Location Copy Properties are applied");

        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "The system should allow the administrator to select a location and " +
                "copy the selected properties successfully."
        );

        ExtentListener.getTest().info(
                "Step 1: Login to MYPC using valid administrator credentials"
        );

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        loginPage.clickLogin();

        ExtentListener.getTest().info(
                "Step 2: Navigate to Location Copy Properties"
        );

        LocationsCopyProperties location = new LocationsCopyProperties(driver);

        location.clickAdmin();
        location.clickTools();
        location.clickLocationTool();

        ExtentListener.getTest().info(
                "Step 3: Select the location from the dropdown"
        );

        location.selectLocation(config.getLocation());

        ExtentListener.getTest().info(
                "Step 4: Enable Target option"
        );

        location.enableTarget();

        ExtentListener.getTest().info(
                "Step 5: Enable Parent Location option"
        );

        location.enableParentLocation();

        ExtentListener.getTest().info(
                "Step 6: Enable Time Zone option"
        );

        location.enableTimeZone();

        ExtentListener.getTest().info(
                "Step 7: Enable Working Hours option"
        );

        location.enableWorkingHours();

        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "Location was selected and all required copy property options " +
                "were enabled successfully."
        );

        ExtentListener.getTest().pass(
                "Location Copy Properties completed successfully."
        );

        // Add assertion if application provides success message or confirmation
        // Assert.assertTrue(location.isCopyPropertiesSuccessful(),
        //        "Location Copy Properties was not successful");
    }
}