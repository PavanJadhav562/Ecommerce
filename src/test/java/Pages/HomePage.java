package Pages;

import basepackage.TestBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBaseClass {
    WebDriver driver;
  @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    WebElement logo;
  public HomePage(WebDriver driver){
      this.driver=driver;
      PageFactory.initElements(driver,this);
  }
  public String getPageName(){
      return logo.getText();
  }


}
