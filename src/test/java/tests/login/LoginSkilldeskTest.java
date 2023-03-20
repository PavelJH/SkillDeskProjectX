package tests.login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageBase;
import tests.TestBase;

public class LoginSkilldeskTest extends HomePage {
    public LoginSkilldeskTest(WebDriver driver) {
        super(driver);
    }
    @Test
    public void logIn(){
        logInSkilldesk();
        clickOnHomeButton();
    }


}
