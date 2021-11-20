package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashboardPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SaveFiltersStepDefs {

    @When("User click SAVE FILTER button")
    public void user_click_SAVE_FILTER_button() {
        BrowserUtils.waitFor(2);
        Driver.driver.manage().window().maximize();
        Driver.driver.findElement(By.xpath("//span[@class='main-ui-filter-add-item']")).click();

    }

    @Then("User wright {string} and click SAVE button")
    public void user_wright_and_click_SAVE_button(String string) {
        Driver.driver.findElement(By.xpath("//input[@class='main-ui-filter-sidebar-edit-control']")).sendKeys("TEAM ACTIVITY");
        Driver.driver.findElement(By.xpath("//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")).click();
    }

    @Then("User check last filters")
    public void user_check_last_filters() {
        BrowserUtils.waitFor(2);
        List<WebElement> actualFilters = Driver.driver.findElements(By.cssSelector("span.main-ui-filter-sidebar-item-text"));
        String expected ="TEAM ACTIVITY";
        List<String> lastList = BrowserUtils.getElementsText(actualFilters);
        //System.out.println(lastList);
        Assert.assertTrue("verify",lastList.contains(expected));

    }
}


