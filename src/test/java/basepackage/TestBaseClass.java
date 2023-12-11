package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass {
    WebDriver driver;
    public WebDriver setWebDriver(String websiteURL){
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get(websiteURL);
        chromeDriver.manage().window().maximize();
        driver=chromeDriver;
        return driver;
    }
    public void closeDriver()
    {
        driver.close();
    }
}
