package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*[@class='main-ui-control main-ui-select']")
    public WebElement filterAndSearchDataList;

    @FindBy(xpath = "//div[@class='popup-select-content']/div[2]")
    public WebElement selectDate;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restore;

}