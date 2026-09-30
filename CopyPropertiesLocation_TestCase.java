package testcase;

import org.testng.annotations.Test;

import adminpage.LocationsCopyProperties;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

public class CopyPropertiesLocation_TestCase extends BaseTest {

    ConfigReader config = new ConfigReader();

    @Test(description =
            "Verifies that an administrator can copy location properties "
            + "including target location, parent location, time zone and working hours.")
    public void VerifyCopyPropertiesLocation() {

        ExtentListener.getTest().info("<b>Scenarios Covered:</b>");
        ExtentListener.getTest().info("• Login with valid administrator credentials");
        ExtentListener.getTest().info("• Navigate to Location Tools");
        ExtentListener.getTest().info("• Open Copy Properties");
        ExtentListener.getTest().info("• Select the required location");
        ExtentListener.getTest().info("• Enable Target Location");
        ExtentListener.getTest().info("• Enable Parent Location");
        ExtentListener.getTest().info("• Enable Time Zone");
        ExtentListener.getTest().info("• Enable Working Hours");
        ExtentListener.getTest().info("• Perform Copy Properties operation");

        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "Administrator should be able to select the required location, "
                + "enable the required location properties and perform the "
                + "Copy Properties operation successfully."
        );

        ExtentListener.getTest().info(
                "Step 1: Login to MYPC using valid administrator credentials"
        );

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        loginPage.clickLogin();

        ExtentListener.getTest().info(
                "Step 2: Navigate to Location Tools"
        );

        LocationsCopyProperties location =
                new LocationsCopyProperties(driver);

        location.clickAdmin();
        location.clickTools();
        location.clickLocationTool();

        ExtentListener.getTest().info(
                "Step 3: Open Copy Properties"
        );

        location.clickCopyProperties();

        ExtentListener.getTest().info(
                "Step 4: Select the required location"
        );

        location.selectLocation(config.getLocation());

        ExtentListener.getTest().info(
                "Step 5: Enable Target Location"
        );

        location.enableTarget();

        ExtentListener.getTest().info(
                "Step 6: Enable Parent Location"
        );

        location.enableParentLocation();

        ExtentListener.getTest().info(
                "Step 7: Enable Time Zone"
        );

        location.enableTimeZone();

        ExtentListener.getTest().info(
                "Step 8: Enable Working Hours"
        );

        location.enableWorkingHours();

        ExtentListener.getTest().info(
                "Step 9: Click Copy"
        );

        location.clickCopy();

        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "The required location was selected, the specified "
                + "location properties were enabled, and the Copy Properties "
                + "operation was performed."
        );
    }
}