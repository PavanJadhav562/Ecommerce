package StepDefinations;
import Pages.HomePage;
import basepackage.TestBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AddToCartSetpDefinations extends TestBaseClass {
    WebDriver driver;
    @Given("I go to {string} website")
    public void iGoToWebsite(String websiteURL) {
        driver=setWebDriver(websiteURL);
    }

    @Then("I confirm we are on {string} home page")
    public void iConfirmOnHomePage(String homePage) {
        HomePage homePage1=new HomePage(driver);
        Assert.assertEquals(homePage,homePage1.getPageName());
    }

    @Then("close the brouser")
    public void close() {
        closeDriver();
    }
}
