package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactModule_Page extends BasePage{

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contacts;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> modules;

}
