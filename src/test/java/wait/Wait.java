package wait;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    public Wait(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    public WebDriverWait wait;
    Duration TIMEOUT = Duration.ofSeconds(10);

    public WebDriverWait setWait() {
        wait = new WebDriverWait(driver, TIMEOUT);
        return wait;
    }

    public void forVisibility(WebElement element) {
        try {
            setWait().until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
