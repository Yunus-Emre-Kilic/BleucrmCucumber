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

import java.util.List;

public class AddAndRemoveStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    List<WebElement> fields = Driver.driver.findElements(By.xpath("//div[@*='main-ui-filter-field-list-item main-ui-select-inner-item main-ui-checked']"));
    List<String> fieldsList =BrowserUtils.getElementsText(fields);

    @When("the user click addfield")
    public void the_user_click_addfield() {
        BrowserUtils.waitFor(2);
        Driver.driver.manage().window().maximize();
        dashboardPage.addField.click();
    }

    @And("Unselect {string},{string},{string},{string} and Select {string},{string},{string}")
    public void unselect_and_select(String Date, String Type, String Author, String To, String Favorites, String Tag, String Extranet) {
        List<WebElement> items = Driver.driver.findElements(By.xpath("//div[@class='main-ui-select-inner-label']"));

        for (int i = 0; i < items.size(); i++) {
            BrowserUtils.waitFor(1);
            items.get(i).click();
        }
    }

    @Then("the user check last selected fields")
    public void the_user_check_last_selected_fields() {
        BrowserUtils.waitFor(1);
        List<WebElement> lastFields = Driver.driver.findElements(By.xpath("//div[@*='main-ui-filter-field-list-item main-ui-select-inner-item main-ui-checked']"));
        List<String> lastFieldsList = BrowserUtils.getElementsText(lastFields);
        Assert.assertFalse("verify",lastFieldsList.contains(fieldsList));


    }


}
