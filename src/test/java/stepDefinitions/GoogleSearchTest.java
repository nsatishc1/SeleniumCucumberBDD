package stepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    public static WebDriver driver;


    @Before
    public static void setup() {
        // Initialize Chrome WebDriver
//        ChromeOptions options = ChromeOptionsUtil.getChromeOptions();
//        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();

        // Initialize Page Objects

    }
    @Given("I open Google")
    public void openGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriverv-win64_V126.0.6478.126win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");

    }
    @When("I search for {string}")
    public void searchString(String query){
        driver.findElement(By.name("q")).sendKeys(query+ Keys.TAB);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("the page title should be anything")
    public void hitSearchButton(){
        driver.findElement(By.xpath("(//input[@role='button'])[2]")).click();

    }


}
