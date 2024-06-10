package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;

public class homePage extends BaseDriver {

    public homePage(WebDriver driver){
        BaseDriver.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement loginHeader;


    public boolean loginHeaderisDisplayed() {

        loginHeader.isDisplayed();

        return true;

    }

    public  void navigatingTo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }

    public static Object getTitle(){

        return  driver.getTitle();
    }
}
