package pages;

import core.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends CommonPage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@data-test='title']")
    private WebElement productBlockTitle ;

    public void verifyLoginSuccessFully(){
        BaseTest.getWait().until(ExpectedConditions.visibilityOf(productBlockTitle)) ;
        Assertions.assertEquals("Products" , productBlockTitle.getText());
    }

}
