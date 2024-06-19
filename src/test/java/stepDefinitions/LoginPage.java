package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.homePage;
import pages.loginPage;
import utility.BaseDriver;

import java.io.File;
import java.io.IOException;

import utility.screenshot.*;


public class LoginPage extends BaseDriver {
    //WebDriver driver;
    loginPage objloginPage = new loginPage(driver);
    homePage objHomePage = new homePage(driver);
    DashboardPage objDashboardPage = new DashboardPage(driver);
    @When("User successfully enters login credentials")
    public void user_successfully_enters_login_credentials() throws IOException, InterruptedException {
        objloginPage.Login_credetials("standard_user", "secret_sauce");
    }

    @Then("User able to view the dashboard")
    public void user_able_to_view_the_dashboard() throws IOException, InterruptedException {
        assertTrue(objDashboardPage.HeaderIsdisplayed(), "Header is displayed", "header is not displayed");
        driver.quit();
    }

    @When("User unable to login")
    public void user_unable_to_login() throws IOException, InterruptedException {
        objloginPage.Login_credetials("locked_out_user", "secret_sauce");
    }

    @Then("Error message is appeared")
    public void error_message_is_appeared() throws IOException, InterruptedException {
        assertEquals(objloginPage.errorMessage.getText(), "Epic sadface: Sorry, this user has been locked out.", "Error message is displayed", "Error message is not displayed");
        driver.quit();
    }


    @And("User able to login")
    public void userIsAbleToLogin() throws InterruptedException {
        objloginPage.Login_credetials("standard_user", "secret_sauce");
    }
}
