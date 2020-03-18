package NopCommHooverAct1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Utils{

    HomePage homePage = new HomePage();
    @Given("user is on home page")
    public void userIsOnHomePage() {

    homePage.userIsOnHomePage();
    }

    @When("user clicks on {string}link from top menu")
    public void userClicksOnLinkFromTopMenu(String category) {
        homePage.userClickOnLinkFromTopMenu(category);
    }

    @Then("user should able to navigate to {string} successfully")
    public void userShouldAbleToNavigateToSuccessfully(String relatedcategorypage) {

        Utils.assertURL(relatedcategorypage);
    }

    @When("user hoover over category {string} link")
    public void userHooverOverCategoryLink(String category) {

        homePage.hooverOverCategoryLink(category);
    }

    @And("click on subcategory {string} link")
    public void clickOnSubcategoryLink(String subcategory) {

        homePage.clickOnSubCategoryLink(subcategory);
    }

    @Then("user should be able to navigate to subcategory page {string} successfully")
    public void userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(String subcateogry) {

        homePage.userShouldBeAbleToNavigateToSubCategoryPageSuccessfully(subcateogry);
    }
}
