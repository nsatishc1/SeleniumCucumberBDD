package stepDefinitions;
import com.example.Pages.GoogleSearchPage;
import com.example.Steps.GoogleSearchSteps;
import io.cucumber.java.After;
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

    public  WebDriver driver;
    public  GoogleSearchSteps objGoogleSearchSteps;

    @Before
    public void setup() {
        // Initialize Chrome WebDriver
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriverv-win64_V126.0.6478.126win64\\chromedriver-win64\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        objGoogleSearchSteps = new GoogleSearchSteps(driver);
        System.out.println("############ i am here ##########");
    }
    @After
    public void tearDown(){
        System.out.println("############ quitting all opened browsers ##########");
        driver.quit();
    }
    @Given("I open Google")
    public void openGoogle(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        objGoogleSearchSteps.open("https://www.google.com");

    }
    @When("I search for {string}")
    public void searchString(String query){
        objGoogleSearchSteps.enterSearchTerm(query+ Keys.TAB);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("the page title should be anything")
    public void hitSearchButton(){
        objGoogleSearchSteps.clickSearchButton();

    }


}
