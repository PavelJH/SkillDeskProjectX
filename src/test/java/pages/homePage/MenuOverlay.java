package pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class MenuOverlay extends PageBase {
    public MenuOverlay(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='t830m__list-title-link t-menu__link-item t-descr t-active']")
    private WebElement startButton;
    @FindBy(xpath = "//a[@class='t830m__list-title-link t-menu__link-item t-descr t-active']")
    private WebElement programsButton;
    @FindBy(xpath = "//div[@class='t830m t830m_bg t830m_close t830m__menu_show']//div[3]//div[1]//div[1]")
    private WebElement studentAreaButton;
    @FindBy(xpath = "//a[normalize-space()='Profile']")
    private WebElement profileButton;
    @FindBy(xpath = "//a[normalize-space()='Timetable']")
    private WebElement timeTableButton;
    @FindBy(xpath = "//a[normalize-space()='Elective']")
    private WebElement electiveButton;
    @FindBy(xpath = "//a[normalize-space()='Homework']")
    private WebElement homeWorkButton;
    @FindBy(xpath = "//a[normalize-space()='My homework']")
    private WebElement myHomeWorkButton;
    @FindBy(xpath = "///a[normalize-space()='Lessons']")
    private WebElement lessonsButton;

    public void openStartPage(){
        click(startButton);
    }
    public void openProgramsPage(){
        click(programsButton);
    }
    public void openAreaPage(){
        click(studentAreaButton);
    }
    public void openProfilePage(){
        click(programsButton);
    }
    public void openTimeTablePage(){
        click(timeTableButton);
    }
    public void electionPage(){
        click(electiveButton);
    }
    public void openHomeWorkPage(){
        click(homeWorkButton);
    }
    public void openMyHomeWorkPage(){
        click(myHomeWorkButton);
    }
    public void openLesionsPage(){
        click(lessonsButton);
    }
}
