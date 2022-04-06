package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.FilesPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US09_Tariq_Step_Definition {


    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();
    String textIs = "Im done for this project, what is next";



    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        //loginPage.loginWithConfig();
        BrowserUtils.DashboardPage(string);
    }

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(2);
        filesPage.actionIcon.click();

        BrowserUtils.sleep(3);
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        BrowserUtils.sleep(2);
        BrowserUtils.FilePage(string);
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.commentsBox.click();
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.textBox.sendKeys(textIs + Keys.ENTER);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        //
        Assert.assertTrue(textIs.equals(filesPage.verifyText.getText()));

    }


}


