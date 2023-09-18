package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(name ="username")
    WebElement userNameTextBox;

    @FindBy(name = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginTitle;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserNameTextBox(String userName){

        WebElement userNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("username")));
        userNameTextBox.sendKeys(userName);

    }

    public void setPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);

    }

    public void clickOnLoginButton(){
        loginButton.click();

    }

    public boolean verifyTitleLoginIsDisplayed(){
        boolean pageTitleLoginIsDisplayed = loginTitle.isDisplayed();
        return pageTitleLoginIsDisplayed;
    }
}
