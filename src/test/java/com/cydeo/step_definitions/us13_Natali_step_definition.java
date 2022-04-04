package com.cydeo.step_definitions;

import com.cydeo.pages.ContactModule_Page;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LoginPage1;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class us13_Natali_step_definition {
    ContactModule_Page contactModule_Page = new ContactModule_Page();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage1().login();
    }
    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        BrowserUtils.waitForClickablility(contactModule_Page.contacts,3);
        contactModule_Page.contacts.click();

    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list(List<String> expectedContacts) {

        Assert.assertEquals("TEXT NOT SAME",expectedContacts,BrowserUtils.getElementsText(contactModule_Page.modules));

    }


}
