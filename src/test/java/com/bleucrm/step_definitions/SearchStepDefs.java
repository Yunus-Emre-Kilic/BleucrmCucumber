package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashboardPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class SearchStepDefs extends DashboardPage {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user click date area and select Current day")
    public void the_user_click_date_area_and_select_Current_day() {
       // dashboardPage.restore.click();
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.id("LIVEFEED_search")).click();
        BrowserUtils.waitFor(3);
        //Driver.get().findElement(By.xpath("//div[@data-name='DATE_CREATE_datesel']")).click();
        //Click on Date DropDown
        WebDriverWait wait=new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-ui-control-field']")));
        Driver.get().findElement(By.xpath("//div[@class='main-ui-control-field']")).click();
        //After Clicking Date DropDown, JavaScript or Hidden HTML5 codes activated
        BrowserUtils.waitFor(4);
       // Driver.get().findElement(By.xpath("//div[@class='popup-select-content']/div[2]")).click();
        dashboardPage.selectDate.click();
        BrowserUtils.waitFor(2);

    }

   /* @And("the user click search button")
    public void the_user_click_search_button() {
        //Driver.get().findElement(By.cssSelector("button[class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")).click();
        dashboardPage.searchButton.click();

    }

    @Then("the user should be see only selected date")
    public void the_user_should_be_see_only_selected_date() {

        BrowserUtils.waitFor(3);
        List<WebElement> feedTime = Driver.driver.findElements(By.xpath("//div[@class='feed-time']"));
        String expected = "today";
        List<String> feedList = BrowserUtils.getElementsText(feedTime);
        System.out.println(feedList);
        for (int i = 0; i < feedTime.size(); i++) {
            System.out.println(feedList.get(i));
            Assert.assertTrue("verify", feedList.get(i).contains(expected));
        }

    }*/
}
