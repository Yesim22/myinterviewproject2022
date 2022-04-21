package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Login_LogoutPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login_LogoutStepDefs {

    Login_LogoutPage lLPage = new Login_LogoutPage();

    @Given("User is on home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }
    @Given("user clicks girisYapButton")
    public void user_clicks_giris_yap_button() {
        Driver.waitAndClick(lLPage.popUp,1);
        ReusableMethods.hover(lLPage.girisYapButton);
        Driver.waitAndClick(lLPage.loginGirisYapButton,2);
    }
    @Given("user provides email id {string}")
    public void user_provides_email_id(String email) {
        Driver.wait(5);
        lLPage.emailTextBox.sendKeys(email);
    }
    @Given("user provides password id {string}")
    public void user_provides_password_id(String password) {
        Driver.wait(5);
        lLPage.passwordTextBox.sendKeys(password);
    }
    @Given("user clicks passwordGirisYapButton")
    public void user_clicks_password_giris_yap_button() {
        Driver.wait(5);
        Driver.waitAndClick(lLPage.passwordGirisYapButton,3);
    }
    @Given("user verifies hesabimText")
    public void user_verifies_hesabim_text() {
        Driver.wait(5);
        Assert.assertTrue(Driver.waitForVisibility(lLPage.girisYapButton,3).isDisplayed());
    }
    @Then("user clicks cikisYapButton")
    public void user_clicks_cikis_yap_button() {
        ReusableMethods.hover(lLPage.girisYapButton);
        Driver.waitAndClick(lLPage.cıkısYapButton,3);
    }

    @Then("user receives error message")
    public void userReceivesErrorMessage() {
        Assert.assertTrue(Driver.waitForVisibility(lLPage.errorMessage,2).isDisplayed());
    }
}
