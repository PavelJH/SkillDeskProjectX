package pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class StartPage extends PageBase {
    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='t830m__list-title-link t-menu__link-item t-descr t-active']")
    private WebElement startButton;
    @FindBy(xpath = "//a[@class='t830m__list-title-link t-menu__link-item t-descr t-active']")
    private WebElement startButton;


}
