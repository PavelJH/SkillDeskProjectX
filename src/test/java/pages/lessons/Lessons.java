package pages.lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class Lessons extends PageBase {

    public Lessons(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath = "(//td[contains(text(),'View lesson')])[1]")
//    private WebElement firstLastLessonViewLesson;
//    @FindBy(xpath = "//body[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]")
//    private WebElement firstLastLessonGiveFeedback;
    @FindBy(id = "target='_blank'")//!!!!
    private WebElement giveFeedback;
    @FindBy(id = "class='t778__btn t-btn t-btn_sm'")//!!!!
    private WebElement viewLesson;
    public void openGiveFeedbackPage(){
        click(giveFeedback);
    }
    public void openViewLessonPage(){
        click(viewLesson);
    }
}
