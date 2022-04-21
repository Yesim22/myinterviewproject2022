package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchBoxPage {

    public SearchBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@class='search-box']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='homepage-popup-gender']")
    public WebElement popUp;

    @FindBy(xpath = "//div[@class='prdct-cntnr-wrppr']")
    public WebElement searchResults;

    @FindBy(xpath = "//div[@class='no-rslt-text']")
    public WebElement errorMessage;
}
