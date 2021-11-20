package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.ArrayList;
import java.util.List;

public class FiltersStepDefs {



    @Then("the user should see following values")
    public void the_user_should_see_following_values(List<String> filters) {
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("WORK");
        expectedList.add("FAVORITES");
        expectedList.add("MY ACTIVITY");
        expectedList.add("ANNOUNCEMENTS");
        expectedList.add("WORKFLOWS");


        com.bleucrm.utilities.BrowserUtils.waitFor(2);
        List<String>actualFilters = com.bleucrm.utilities.BrowserUtils.getElementsText(new DashboardPage().filters);
        actualFilters.remove(1);
        actualFilters.remove(5);

        System.out.println("expectedList = " + expectedList);
        System.out.println("actualFilters = " + actualFilters);
        Assert.assertTrue("verify",actualFilters.equals(expectedList));
    }

}