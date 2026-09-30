package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.LoginPage;
import adminpage.UserDeskBookingRules;
import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

public class UserDeskBookingrulesTestCase extends BaseTest {

    ConfigReader config = new ConfigReader();

    @Test(description =
            "Verifies that an administrator can navigate to User Desk Booking Rules, "
            + "select Automation Tags, configure the required desk booking rules and "
            + "submit the booking rule settings.")
    public void VerifyAddUser() {

        ExtentListener.getTest().info("<b>Scenarios Covered:</b>");
        ExtentListener.getTest().info("• Login with valid administrator credentials");
        ExtentListener.getTest().info("• Navigate to User Desk Booking Rules");
        ExtentListener.getTest().info("• Select Automation Tags");
        ExtentListener.getTest().info("• Verify Access is selected");
        ExtentListener.getTest().info("• Configure Maximum Bookings Per Month");
        ExtentListener.getTest().info("• Verify Maximum Per Month is selected");
        ExtentListener.getTest().info("• Configure Maximum Booking Duration");
        ExtentListener.getTest().info("• Verify Maximum Booking Duration is selected");
        ExtentListener.getTest().info("• Configure Booking Per Day");
        ExtentListener.getTest().info("• Verify Booking Per Day is selected");
        ExtentListener.getTest().info("• Configure Maximum Allowed Per Day");
        ExtentListener.getTest().info("• Verify Maximum Allowed Per Day is selected");
        ExtentListener.getTest().info("• Configure Maximum Period to Book in Advance");
        ExtentListener.getTest().info("• Verify Maximum Period Advance is selected");
        ExtentListener.getTest().info("• Verify Submit button is displayed");
        ExtentListener.getTest().info("• Click Submit");

        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "The administrator should be able to select Automation Tags, configure "
                + "the required User Desk Booking Rules, verify the configured options "
                + "and submit the booking rule settings."
        );

        ExtentListener.getTest().info(
                "Step 1: Login to MYPC using valid administrator credentials"
        );

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        loginPage.clickLogin();

        ExtentListener.getTest().info(
                "Step 2: Navigate to User Desk Booking Rules"
        );

        UserDeskBookingRules users =
                new UserDeskBookingRules(driver);

        users.clickAdmin();
        users.clickTools();
        users.clickUser();
        users.clickBookingRules();
        users.clickDeskPage();
        users.clickTags();

        ExtentListener.getTest().info(
                "Step 3: Select Automation Tags"
        );

      

        users.enableAccess();

        Assert.assertTrue(
                users.isAccessSelected(),
                "Access is not selected"
        );
        
        ExtentListener.getTest().info("Select Toogle");
        
        users.enableToogle();
        
        Assert.assertTrue(
        	    users.isToogleSelected(),
        	    "Access toggle is not selected"
        	);

        ExtentListener.getTest().info(
                "Step 5: Configure Maximum Bookings Per Month"
        );

        users.clickMaximumPerMonth();

        Assert.assertTrue(
                users.isMaximumPerMonthSelected(),
                "Maximum Per Month is not selected"
        );

        ExtentListener.getTest().info(
                "Step 6: Configure Maximum Booking Duration"
        );

        users.clickMaximumBookingDuration();

        Assert.assertTrue(
                users.isMaximumBookingDurationSelected(),
                "Maximum Booking Duration is not selected"
        );

        ExtentListener.getTest().info(
                "Step 7: Configure Booking Per Day"
        );

        users.clickBookingPerDay();

        Assert.assertTrue(
                users.isBookingPerDaySelected(),
                "Booking Per Day is not selected"
        );

        ExtentListener.getTest().info(
                "Step 8: Configure Maximum Allowed Per Day"
        );

        users.clickMaximumAllowedPerDay();

        Assert.assertTrue(
                users.isMaximumAllowedPerDaySelected(),
                "Maximum Allowed Per Day is not selected"
        );

        ExtentListener.getTest().info(
                "Step 9: Configure Maximum Period to Book in Advance"
        );

        users.clickMaximumPeriodAdvance();

        Assert.assertTrue(
                users.isMaximumPeriodAdvanceSelected(),
                "Maximum Period Advance is not selected"
        );

        ExtentListener.getTest().info(
                "Step 10: Verify Submit button is displayed"
        );

        Assert.assertTrue(
                users.isSubmitDisplayed(),
                "Submit button is not displayed"
        );

        ExtentListener.getTest().info(
                "Step 11: Click Submit"
        );

        users.clickSubmit();

        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "The administrator logged in successfully, navigated to User Desk "
                + "Booking Rules, selected Automation Tags, configured and verified "
                + "the required booking rule options, and performed the Submit operation."
        );
    }
}