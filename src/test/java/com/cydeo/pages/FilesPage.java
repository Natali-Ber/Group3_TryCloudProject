package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class FilesPage extends BasePage {

    @FindBy(css = "button[class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "(//p[text()])[1]")
    public WebElement numberOfUsage;

    @FindBy(css = "span[class='icon icon-add']")
    public WebElement icon_add;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement uploadFileBtn2;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']/span[2]")
    public WebElement details;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsBox;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement textBox;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement verifyText;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement checkBox;

    @FindBy(xpath = "(//a[@class='name sort columntitle']/span[text()='Name'])[1]")
    public WebElement waitWebElement;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public List<WebElement> allActionsInFiles;


    @FindBy(xpath = " (//span[contains(.,'Delete f')])[2]")
    public WebElement deleteWebElement;

    public String chooseRandomFileInFilesPage() {



        int number = allActionsInFiles.size();
        String Locater ="(//a//span[contains(@class, 'icon-more')])["+number+"]";
        String expectedFileName = Driver.getDriver().findElement(By.xpath("(//span[@class='nametext'])["+number+"]/span")).getText();

        System.out.println(expectedFileName);

     allActionsInFiles.get(number-1).click();

        BrowserUtils.sleep(3);

        return expectedFileName;

    }

    public void chooseAnOption(String action) {


      BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//li//span[contains(normalize-space(.),'"+action+"')]")).click();
    }


}
