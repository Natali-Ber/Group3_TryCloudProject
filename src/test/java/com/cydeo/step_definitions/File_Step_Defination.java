package com.cydeo.step_definitions;

import com.cydeo.pages.FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class File_Step_Defination {

FilesPage filesPage = new FilesPage();

    String expectedDeletedFile;



    @When("user click action-icon from any file in order to delete")
    public void user_click_action_icon_from_any_file_in_order_to_delete() {
       expectedDeletedFile = filesPage.chooseRandomFileInFilesPage();



    }


    @When("user choose {string} option")
    public void user_choose_option(String option) {
        filesPage.chooseAnOption(option);
    }
    @When("user click {string} sub-module on the left side")
    public void user_click_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    }



}
