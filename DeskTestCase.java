package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.DeskPage;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

public class DeskTestCase extends BaseTest {

    ConfigReader config = new ConfigReader();

    @Test(description =
            "Verifies that an administrator can add a new Desk with valid desk details, "
            + "location, duration, preparation time, check-in settings and desk tags.")
    public void VerifyAddDeskTestCase() {

        ExtentListener.getTest().info("<b>Scenarios Covered:</b>");
        ExtentListener.getTest().info("• Login with valid administrator credentials");
        ExtentListener.getTest().info("• Navigate to Desk");
        ExtentListener.getTest().info("• Open Add New Desk");
        ExtentListener.getTest().info("• Enter Desk Name");
        ExtentListener.getTest().info("• Select Desk Location");
        ExtentListener.getTest().info("• Configure Default Duration");
        ExtentListener.getTest().info("• Configure Advanced Options");
        ExtentListener.getTest().info("• Configure Preparation Time");
        ExtentListener.getTest().info("• Enable Check-in Required");
        ExtentListener.getTest().info("• Add and select Desk Tags");
        ExtentListener.getTest().info("• Add the Desk");
        ExtentListener.getTest().info("• Verify Add operation");

        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "Administrator should be able to enter valid Desk details, select the "
                + "required location, configure duration and advanced settings, enable "
                + "check-in, select the required Desk Tag and perform the Add operation."
        );

        // Step 1: Login
        ExtentListener.getTest().info(
                "Step 1: Login to MYPC using valid administrator credentials"
        );

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        loginPage.clickLogin();

        // Step 2: Navigate to Desk
        ExtentListener.getTest().info(
                "Step 2: Navigate to Desk"
        );

        DeskPage desk = new DeskPage(driver);

        desk.ClickAdmin();
        desk.ClickDesk();

        // Step 3: Add New Desk
        ExtentListener.getTest().info(
                "Step 3: Click Add New Desk"
        );

        desk.ClickAddNew();

        Assert.assertTrue(
                desk.isDisplayedAddNew(),
                "AddNew is not displayed"
        );

        // Step 4: Enter Desk Name
        ExtentListener.getTest().info(
                "Step 4: Enter Desk Name"
        );

        desk.enterDeskName(config.getDeskName());

        // Step 5: Select Location
        ExtentListener.getTest().info(
                "Step 5: Select Desk Location"
        );

        desk.selectLocation(config.getLocation());

        Assert.assertTrue(
                desk.isDisplayedLocation(),
                "Location is not displayed"
        );

        // Step 6: Default Duration
        ExtentListener.getTest().info(
                "Step 6: Configure Default Duration"
        );

        desk.enterDefaultDuration(config.getDuration());

        // Step 7: Advanced Options
        ExtentListener.getTest().info(
                "Step 7: Open Advanced Options"
        );

        desk.ClickAdvanceOption2();

        // Step 8: Preparation Time
        ExtentListener.getTest().info(
                "Step 8: Configure Preparation Time"
        );

        desk.selectPrepartion(config.getPrepration());

        // Step 9: Check-in Required
        ExtentListener.getTest().info(
                "Step 9: Enable Check-in Required"
        );

        desk.enableCheckInRequired();

        Assert.assertTrue(
                desk.isSelectedCheckbox(),
                "Checkbox is not Selected"
        );

        // Step 10: Desk Tags
        ExtentListener.getTest().info(
                "Step 10: Open Tags and Booking"
        );

        desk.clickTagsandBooking();

        ExtentListener.getTest().info(
                "Step 11: Open Add Tags"
        );

        desk.clickTagsAdd();

        ExtentListener.getTest().info(
                "Step 12: Select Desk Tag"
        );

        desk.selectTags(config.getDeskTagName());

        // Step 13: Add Desk
        ExtentListener.getTest().info(
                "Step 13: Click Add to create the Desk"
        );

        desk.ClickAdd();

        // Step 14: Verify Add
        ExtentListener.getTest().info(
                "Step 14: Verify Add operation"
        );

        Assert.assertTrue(
                desk.isAddDisplayed(),
                "Add is not displayed"
        );

        // Actual Result
        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "The Desk details were entered, the location and duration were "
                + "configured, advanced options and preparation time were selected, "
                + "Check-in Required was enabled and verified, and the required Desk "
                + "Tag was selected. The Add operation was performed and the Add "
                + "element was displayed as expected."
        );
    }
}