package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashboardPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enters the hrUser information")
    public void the_user_enters_the_hrUser_information() throws InterruptedException {
        String username = ConfigurationReader.get("human_resource_username");
        String password = ConfigurationReader.get("human_resource_password");
        Driver.driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_ables_to_login() {
        com.bleucrm.utilities.BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Portal",actualTitle);
    }
    @And("the user click on filter and search field")
    public void the_user_click_on_filter_and_search_field() {
        dashboardPage.filterAndSearchBox.click();
    }


}
