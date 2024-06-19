package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;


public class loginPage extends BaseDriver {




    public loginPage(WebDriver driver) {
        BaseDriver.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement username_field;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password_field;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement LoginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errorMessage;


    public void Login_credetials(String username, String password){
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        LoginButton.click();
    }




}

