package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;

public class DashboardPage extends BaseDriver {

    //div[@class ='app_logo'and text()='Swag Labs']
    public DashboardPage(WebDriver driver){
        BaseDriver.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class ='app_logo'and text()='Swag Labs']")
    private WebElement  HeaderPage;


    public boolean HeaderIsdisplayed(){
        HeaderPage.isDisplayed();
        System.out.println("Header is displayed");
        return true;
    }



}
