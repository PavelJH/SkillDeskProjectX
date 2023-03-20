package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='in-1531306243545']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='in-1531306540094']")
    private WebElement passwordField;

    @FindBy(xpath = "//a[@class='tn-atom']")
    private WebElement loginInButton;
    @FindBy(xpath = "//a[normalize-space()='Recover password']")
    private WebElement recoverPassword;

    public void clickOnHomeButton() {
        click(loginInButton);
    }
    public void logInSkilldesk(){
        fillFields(loginField, "Kelbaspavel@gmail.com");
        fillFields(passwordField, "VGlBbEQy ");
    }
}
