package net.crmly.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = { "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber" },
        features = {"src/test/resources/features"},
        glue = {"net/crmly/step_definitions"},
        dryRun = false,
        tags = "@wip",
        publish = true
)

public class CukesRunner {}
