package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import pages.DashboardPage;
import pages.loginPage;
import utility.BaseDriver;

import java.io.File;
import java.io.IOException;

import utility.screenshot.*;


public class LoginPage extends BaseDriver {
    //WebDriver driver;

    @When("User successfully enters login credentials")
    public void user_successfully_enters_login_credentials() throws IOException, InterruptedException {
        loginPage objloginPage = new loginPage(driver);
        objloginPage.Login_credetials("standard_user", "secret_sauce");
    }

    @Then("User able to view the dashboard")
    public void user_able_to_view_the_dashboard() throws IOException, InterruptedException {
        DashboardPage objDashboardPage = new DashboardPage(driver);
        assertTrue(objDashboardPage.HeaderIsdisplayed(), "Header is displayed", "header is not displayed");
        driver.quit();
    }

    @When("User unable to login")
    public void user_unable_to_login() throws IOException, InterruptedException {
        loginPage objloginPage = new loginPage(driver);
        objloginPage.Login_credetials("locked_out_user", "secret_sauce");
    }

    @Then("Error message is appeared")
    public void error_message_is_appeared() throws IOException, InterruptedException {
        loginPage objloginPage = new loginPage(driver);
        assertEquals(objloginPage.errorMessage.getText(), "Epic sadface: Sorry, this user has been locked out.", "Error message is displayed", "Error message is not displayed");
        driver.quit();
    }
}
