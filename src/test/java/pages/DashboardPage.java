package pages;


import org.junit.Assert;
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

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    private WebElement addToCartBtn;

    @FindBy(xpath="//a[@class='shopping_cart_link']/span")
    private WebElement shoppingCartContainer;


    public boolean HeaderIsdisplayed(){
        HeaderPage.isDisplayed();
        System.out.println("Header is displayed");
        return true;
    }

    public void clickAddtoCartBtn(){
        addToCartBtn.click();
    }

    public boolean shoppingCartisContainOrder(String orderCount){
        shoppingCartContainer.isDisplayed();
        String actualOrderCount = shoppingCartContainer.getText();
        Assert.assertEquals(actualOrderCount,orderCount);
        return true;
    }



}
