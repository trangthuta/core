package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.utils.Constants.BASE_URL;
import static core.utils.Constants.TIMEOUTEXPLICITWAIT;

public class BaseTest {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void createDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUTEXPLICITWAIT));
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }
}
