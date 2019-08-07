package cucumberrunner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


//import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;


//uncomment @runwith if you are using JUnit to run test
@RunWith(Cucumber.class)
// @CucumberOptions(features= {"Features"})
@CucumberOptions(
        features = "Features",
        glue = { "Hive" },
        // tags = {"@Chrome"},
        monochrome = true, // display control output in proper readable format
        // plugin= {"html:target/cucumber-html-report"}
        plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
                "junit:target/cucumber-result.xml",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/report.html",
//				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
//				"com.sitture.ExtentFormatter:target/extent-report/index.html", "html:target/html-report"
        }
//		tags = {"@loginFlow, @adviser_dashboard, @portfolio_screen, @sd_validations, @user_profile"}
)
// public class Cucumber_Main extends AbstractTestNGCucumberTests{


public class cucumber_main {


}
