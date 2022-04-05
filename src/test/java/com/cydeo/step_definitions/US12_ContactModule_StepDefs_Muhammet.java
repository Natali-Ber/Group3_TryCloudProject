package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_ContactModule_StepDefs_Muhammet {


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().login();
    }

    @When("user clicks {string} module")
    public void user_clicks_module(String module) {
        new DashboardPage().clickModule(module);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
