package com.bleucrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"}, //kodun hangi senaryoda hata verdigini txt dosyasina yazdiriyor
        features = "src/test/resources/features",   //telling where is features file located
        glue = "com/bleucrm/step_definitions",         //glue is telling where step definitions located
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
