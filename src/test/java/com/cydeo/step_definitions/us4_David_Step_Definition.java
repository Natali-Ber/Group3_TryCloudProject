package com.cydeo.step_definitions;

import com.cydeo.pages.DavidPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class us4_David_Step_Definition {

    LoginPage loginPage = new LoginPage();
    DavidPage davidPage = new DavidPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page(){
        loginPage.loginWithConfig();

    }


    @When("User clicks on the talks icon")
    public void user_clicks_on_the_talks_icon() throws InterruptedException {
        davidPage.talksBtn.click();
        Thread.sleep(3000);



    }
    @Then("The the talks page is accessible to the user")
    public void the_the_talks_page_is_accessible_to_the_user() throws InterruptedException {

        String expectedTitle = "Talk - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
