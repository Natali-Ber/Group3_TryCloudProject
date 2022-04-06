package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.border.TitledBorder;

public class DavidPage extends BasePage{

    @FindBy(xpath = "(//a[@href='http://qa3.trycloud.net/index.php/apps/spreed/'])[1]")
    public WebElement talksBtn;

    String expectedTitle = "Talk - Trycloud QA";
    String actualTitle = Driver.getDriver().getTitle();
    public void expectationMethod(){
        Assert.assertEquals(expectedTitle, actualTitle, "title does not match, therefore user has no access");
    }


}
