package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.homePage;
import utility.BaseDriver;




public class HomePage extends BaseDriver {

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        homePage objHomePage = new homePage(driver);
        objHomePage.navigatingTo();

    }
}

