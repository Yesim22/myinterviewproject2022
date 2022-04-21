package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.SearchBoxPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SearchBoxStepDefs {

    SearchBoxPage sbPage = new SearchBoxPage();

    @Given("User on home page")
    public void user_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

    @Given("user provides item {string}")
    public void userProvidesItem(String item) {
        Driver.waitAndClick(sbPage.popUp,1);
        sbPage.searchBox.sendKeys(item+ Keys.ENTER);
    }

    @And("user returns the search result")
    public void userReturnsTheSearchResult() {
        Assert.assertTrue(Driver.waitForVisibility(sbPage.searchResults,2).isDisplayed());
    }

    @Then("user receive error message")
    public void userReceiveErrorMessage() {
        Assert.assertTrue(Driver.waitForVisibility(sbPage.errorMessage,2).isDisplayed());
    }
}
