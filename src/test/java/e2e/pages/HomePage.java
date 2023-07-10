package e2e.pages;
import e2e.wait.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    Wait wait;

    @FindBy(xpath = "//img[@class='sw-width-5xs']")
    protected WebElement welcomeToNoCodeUniversityText;

    @FindBy(xpath = "//a[normalize-space()='Sign up now']")
    protected WebElement signUpNowOnHomePageButton;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    protected WebElement singInOnHomePageButton;

    @FindBy(xpath = "//*[@class='col-md-6 text-center text-lg-left pt-5 pt-lg-0']")
    protected WebElement aboutUsInfoOnHomePageRow;

    @FindBy(xpath = "//div[@class='row']//div[1]//div[1]")
    protected WebElement firstRowAboutUsInfo;
    @FindBy(xpath = "(//div[contains(@class,'s-feature-box')])[2]")
    protected WebElement secondRowAboutUsInfo;
    @FindBy(xpath = "(//div[contains(@class,'s-feature-box')])[3]")
    protected WebElement thirdRowAboutUsInfo;
    @FindBy(xpath = "(//div[contains(@class,'s-feature-box')])[3]")
    protected WebElement fourthRowAboutUsInfo;

    @FindBy(xpath = "//*[@data-item-index='0']//a")
    protected WebElement firstCourseGoToButton;
    @FindBy(xpath = "//*[@data-item-index='1']//a")
    protected WebElement secondCourseGoToButton;
    @FindBy(xpath = "//*[@data-item-index='2']//a")
    protected WebElement thirdCourseGoToButton;

    @FindBy(xpath = "//span[normalize-space()='Professor spotlight']")
    protected WebElement professorSpotlightOnHomePage;
    @FindBy(xpath = "//*[contains(@class, 'MuiGrid-grid-sm-4')]")
    protected WebElement professorsSpotlightList;
    @FindBy(xpath = "//*[contains(@class, 'MuiGrid-grid-sm-8')]")
    protected WebElement professorsSpotlightInfoAboutProfessors;


    public void waitForLoadingWelcomeToNoCodeUniversityText() {
        wait = new Wait(driver);
        wait.forVisibility(welcomeToNoCodeUniversityText);
    }

    public void clickSignUpNowButton(){
        click(signUpNowOnHomePageButton);
    }
    public void clickSingInButton(){
        click(singInOnHomePageButton);
    }

    public void clickFirstCourseGoToButton(){
        click(firstCourseGoToButton);
    }
    public void clickSecondCourseGoToButton(){
        click(secondCourseGoToButton);
    }
    public void clickThirdCourseGoToButton(){
        click(thirdCourseGoToButton);
    }

}