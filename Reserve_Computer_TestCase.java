package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.LoginPage;
import adminpage.Reserve_Computer_Page;
import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

public class Reserve_Computer_TestCase extends BaseTest {

    ConfigReader config = new ConfigReader();

    @Test(description =
            "Verifies that an administrator can navigate to Reserve Computer, "
            + "select a location and booking date, configure booking options, "
            + "and proceed with a computer booking.")
    public void verifyReserveAdd() {

        ExtentListener.getTest().info("<b>Scenarios Covered:</b>");
        ExtentListener.getTest().info("• Login with valid administrator credentials");
        ExtentListener.getTest().info("• Navigate to Reserve Computer");
        ExtentListener.getTest().info("• Select Location");
        ExtentListener.getTest().info("• Verify Location is displayed");
        ExtentListener.getTest().info("• Select Booking Date");
        ExtentListener.getTest().info("• Enable Tooltips");
        ExtentListener.getTest().info("• Verify Tooltips are displayed");
        ExtentListener.getTest().info("• Select Start Time");
        ExtentListener.getTest().info("• Enable Self Booking");
        ExtentListener.getTest().info("• Verify Self Booking is selected");
        ExtentListener.getTest().info("• Click Book");
        ExtentListener.getTest().info("• Verify Book button is displayed");

        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "The user should be able to navigate to Reserve Computer, "
                + "select the required booking details and proceed with the "
                + "computer booking."
        );

        ExtentListener.getTest().info(
                "Step 1: Login to MYPC using valid administrator credentials"
        );

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                config.getEmail(),
                config.getPassword()
        );

        ExtentListener.getTest().info(
                "Step 2: Navigate to Reserve Computer"
        );

        Reserve_Computer_Page reservePage =
                new Reserve_Computer_Page(driver);

        reservePage.ClickReserve();
        reservePage.ClickComputer();

        ExtentListener.getTest().info(
                "Step 3: Select Location"
        );

        reservePage.SelectLocation(config.getLocation());

        Assert.assertTrue(
                reservePage.isDisplayedLocation(),
                "Location is not displayed"
        );

        ExtentListener.getTest().info(
                "Step 4: Select Booking Date"
        );

        reservePage.selectDate(
                config.getReserveBookingDate()
        );

        ExtentListener.getTest().info(
                "Step 5: Enable Tooltips"
        );

        reservePage.ClickTooltips();

        Assert.assertTrue(
                reservePage.isDisplayedTooltips(),
                "Tooltips is not displayed"
        );

        ExtentListener.getTest().info(
                "Step 6: Select Start Time"
        );

        reservePage.SelectStartTime2(
                config.getStartTime2()
        );

        ExtentListener.getTest().info(
                "Step 7: Enable Self Booking"
        );

        reservePage.EnableSelfBookings();

        Assert.assertTrue(
                reservePage.isSelectedSelfBooking(),
                "Self Booking is not selected"
        );

        ExtentListener.getTest().info(
                "Step 8: Click Book"
        );

        reservePage.ClickBooks();

        ExtentListener.getTest().info(
                "Step 9: Verify Book button is displayed"
        );

        Assert.assertTrue(
                reservePage.isDisplayedBooks(),
                "Book button is not displayed"
        );

        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "The Reserve Computer page was accessed successfully. The configured "
                + "Location and Booking Date were selected, Tooltips and Self Booking "
                + "were configured, and the Book action was performed successfully."
        );
    }
}