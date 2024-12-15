package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
    public CommonPage(WebDriver driver) {
        PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }
}
