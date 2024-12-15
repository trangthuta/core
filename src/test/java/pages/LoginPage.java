package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.BaseTest.getWait;

public class LoginPage extends CommonPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="user-name")
    private WebElement email  ;

    @FindBy(id="password")
    private WebElement password  ;

    @FindBy(id="login-button")
    private WebElement loginbutton  ;

    public void enterAValidEmail(){
        getWait().until(ExpectedConditions.visibilityOf(email)) ;
        email.clear();
        email.sendKeys("standard_user");
    }

    public void enterAValidPassword(){
        getWait().until(ExpectedConditions.visibilityOf(password)) ;
        password.clear();
        password.sendKeys("secret_sauce");
    }

    public void clickOnLoginButton(){
        getWait().until(ExpectedConditions.visibilityOf(loginbutton)) ;
        loginbutton.click();
    }


}
