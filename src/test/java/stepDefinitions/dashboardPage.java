package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import utility.BaseDriver;

public class dashboardPage extends BaseDriver {

    @When("User click the add to cart of desire item")
    public void user_click_the_add_to_cart_of_desire_item(){
        DashboardPage objDashBoard =  new DashboardPage(driver);
        objDashBoard.clickAddtoCartBtn();
    }

    @Then("It will display the remove button and will display the one item in the cart")
    public void itWillDisplayTheRemoveButtonAndWillDisplayTheOneItemInTheCart() {
        DashboardPage objDashBoard =  new DashboardPage(driver);
        objDashBoard.shoppingCartisContainOrder("1");
        driver.quit();
    }
}
