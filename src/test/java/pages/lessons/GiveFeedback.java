package pages.lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class GiveFeedback extends PageBase {
    public GiveFeedback(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "//div[@aria-label='Add to Выберете себя из списка студентов field']")
    private WebElement choseStudent;
    @FindBy(id = "(//div[@role='button'])[5]")
    private WebElement choiceOfLectureComplexity;
    @FindBy(id = "(//div[@role='button'])[7]")
    private WebElement choiceQualityTeacher;
    @FindBy(id = "(//div[@role='textbox'])[1]")
    private WebElement  changeInTheProcess;
    @FindBy(id = "(//div[@role='textbox'])[2]")
    private WebElement  likeAboutTheClass;
    @FindBy(id = "(//div[@role='textbox'])[3]")
    private WebElement  classCommentary;
    @FindBy(id = "//input[@value='Отправить']")
    private WebElement  sendButton;


    public void inputText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
