package Hive;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import static org.openqa.selenium.By.xpath;


public class Buy_order {

    WebDriver driver;

    @Given("^user is on hive homepage$")
    public void user_is_on_hive_homepage() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiji\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://qa-hive.powerwrap.com.au");
        driver.findElement(xpath("//*[@id=\"user_email\"]")).sendKeys("tijimaliekal@powerwrap.com.au");
        driver.findElement(xpath("//*[@id=\"user_password\"]")).sendKeys("Maliekal@123");
        driver.findElement(By.id("m_login_signin_submit")).click();
        Thread.sleep(1000);
    }

    @When("^user initiate a Buy order$")
    public void user_initiate_a_Buy_order() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"horizontal-menu\"]/ul/li[1]/a")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"investor-list-data\"]/table/tbody/tr[1]")).click();
        Thread.sleep(9000);
        driver.findElement(By.id("place_an_order")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='buy']")).click(); //Buy

        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[@class='select2-selection__placeholder']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']/div[@class='fund-option-wrap' and 1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='orderAmountValue']")).sendKeys("1");
        driver.findElement(By.xpath("//span[@id='advise_no_option']")).click();
        driver.findElement(By.xpath("//label[@id='accept_disclaimer']/span[1]")).click();
        driver.findElement(By.xpath("//button[@id='add-btn']")).click();
       }

    @Then("^user should successfully place the order$")
    public void user_should_successfully_place_the_order() throws Throwable {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn m-btn m-btn--icon preview_btn margin-left-10 footer-btn-style']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("preview_accept_disclaimer_02")).click();
        driver.findElement(By.xpath("//button[@id='confirm-order']")).click();

    }


}
