package com.sprint2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/sprint2/step_definitions",
        dryRun = false,
        tags = "@B30G17-180",
        publish = true //generating a report with public link
)
public class CukesRunner {}

