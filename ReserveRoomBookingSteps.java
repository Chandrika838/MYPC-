package Stepdefinitation;

import java.time.LocalDate;

import org.testng.Assert;

import adminpage.Reserve_RoomPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReserveRoomBookingSteps {

    private Reserve_RoomPage reserveRoomPage;
    private ConfigReader config;

    private void initReserveRoomPage() {

        if (config == null) {
            config = new ConfigReader();
        }

        if (reserveRoomPage == null) {
            reserveRoomPage = new Reserve_RoomPage(HookClass.driver);
        }
    }

    @When("I open Reserve")
    public void i_open_reserve() {

        initReserveRoomPage();

        reserveRoomPage.clickReserve();
    }

    @And("I open Reserve Room")
    public void i_open_reserve_room() {

        initReserveRoomPage();

        reserveRoomPage.clickRoom();
    }

    @And("I select reserve room location")
    public void i_select_reserve_room_location() {

        initReserveRoomPage();


        String location = config.getLocation();

        System.out.println("User tag from config = [" + location + "]");

        reserveRoomPage.selectLocation(location);
        
    } 
        
      
    @Then("Reserve room location should be displayed")
    public void reserve_room_location_should_be_displayed() {

        initReserveRoomPage();

        Assert.assertTrue(
                reserveRoomPage.isDisplayedLocation(),
                "Reserve Room Location is not displayed"
        );
    }

    @And("I select reserve room date")
    public void i_select_reserve_room_date() {

        initReserveRoomPage();

        reserveRoomPage.selectDate(
                LocalDate.now().plusDays(1)
        );
    }

    @And("I click reserve room tooltip")
    public void i_click_reserve_room_tooltip() {

        initReserveRoomPage();

        reserveRoomPage.clickToolTip();
    }

    @And("I select reserve room start time")
    public void i_select_reserve_room_start_time() {

        initReserveRoomPage();

        reserveRoomPage.SelectStartTime1(
                config.getstartTime()
        );
    }

    @And("I drag reserve room slider")
    public void i_drag_reserve_room_slider() {

        initReserveRoomPage();

        reserveRoomPage.clickDragdrop();
    }

    @And("I enable reserve room self booking")
    public void i_enable_reserve_room_self_booking() {

        initReserveRoomPage();

        reserveRoomPage.enableSelfBooking();
    }

    @And("I click reserve room Book button")
    public void i_click_reserve_room_book_button() {

        initReserveRoomPage();

        reserveRoomPage.clickSubmit();
    }
}