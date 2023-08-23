package com.zeroBank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/zeroBank/StepDefs",
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html"
        },
        dryRun = false,
        tags = "@positiveLogin"
)

public class CukesRunner {
}
