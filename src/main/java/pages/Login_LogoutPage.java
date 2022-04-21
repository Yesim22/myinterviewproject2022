package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_LogoutPage {

    public Login_LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//p[@class='link-text']")
    public WebElement girisYapButton;

    @FindBy(xpath="//div[@class='login-button']")
    public WebElement loginGirisYapButton;

    @FindBy(id="login-email")
    public WebElement emailTextBox;

    @FindBy(id="login-password-input")
    public WebElement passwordTextBox;

    @FindBy(xpath="//button[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement passwordGirisYapButton;

    @FindBy(xpath="//i[@class='i-logout']")
    public WebElement cıkısYapButton;

    @FindBy(xpath = "//span[@class='homepage-popup-gender']")
    public WebElement popUp;

    @FindBy(xpath = "//span[@class='message']")
    public WebElement errorMessage;
}