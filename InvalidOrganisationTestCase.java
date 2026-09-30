package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.LoginPage;
import adminpage.OrganisationPage;

public class InvalidOrganisationTestCase extends BaseTest {

    @Test(description = "Verify validation message when Organisation mandatory configuration is incomplete")
    public void verifyOrganisationMandatoryValidation() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail(config.getEmail());
        loginPage.enterPassword(config.getPassword());
        loginPage.clickLogin();

        // Step 2: Navigate to Organisation
        OrganisationPage organisationPage =
                new OrganisationPage(driver);

        organisationPage.clickAdminMenu();
        organisationPage.clickOrganisation();

        // Step 3: Select Language
        organisationPage.SelectLanguage(
                config.getlanguage()
        );

        // Step 4: Select Time Zone
        organisationPage.selectTimeZone(
                config.gettimeZone()
        );

        // Step 5: Open Advanced Options
        organisationPage.clickAdvancedOption();

        // Step 6:
        // Leave the mandatory Organisation configuration incomplete.
        // Do NOT select/complete the mandatory authentication configuration.

        // Step 7: Submit
        organisationPage.clickSubmit();

        // Step 8: Verify validation message
        String actualMessage =
                organisationPage.getValidationMessage();

        Assert.assertEquals(
                actualMessage,
                "Invalid entry!",
                "Expected 'Invalid entry!' validation message was not displayed."
        );
    }
}