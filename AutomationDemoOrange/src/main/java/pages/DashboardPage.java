package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardTitle;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropDown;

    @FindBy(linkText = "Logout")
    WebElement logoutSelect;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean pageDashboardTitleIsDisplayed(){
        boolean pageTitleDashBoardIsDisplayed = dashboardTitle.isDisplayed();
        return pageTitleDashBoardIsDisplayed;
    }

    public void clickOnMyInfoButton(){

        WebElement myInfoButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = '/web/index.php/pim/viewMyDetails']")));

        myInfoButton.click();
    }

    public void clickOnBuzzButton(){
        WebElement buzzButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'uzz')]")));

        buzzButton.click();
    }

    public void clickOnLogoutOrangePage() throws InterruptedException {
        Thread.sleep(5000);
        userDropDown.click();
        Thread.sleep(5000);
        logoutSelect.click();
    }

}
