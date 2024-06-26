import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Amazon {

    private void navigateToSite(WebDriver driver) {
        driver.get("https://www.amazon.com/tr/");
    }

    private void windowMaximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void runToAmazon() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            initializedDriver();
            navigateToSite(driver);
            windowMaximize(driver);
            IDs(driver);
            xPaths(driver);
            handleIds(driver);
            amount(driver);
            updateAmount(driver);
            emptyTheCart(driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    private void initializedDriver() {
        WebDriverManager.chromedriver();
        WebDriverManager.chromedriver().setup();
    }

    private void IDs(WebDriver driver) throws InterruptedException {
        String[] Ids = {"twotabsearchtextbox"};
        for (String id : Ids) {
            WebElement element = driver.findElement(By.id(id));
            element.click();
            element.sendKeys("samsung buds 2 fe");
            element.sendKeys(Keys.ENTER);
        }
    }

    private void xPaths(WebDriver driver) throws InterruptedException {
        String[] xpaths = {"//img[@data-image-index='6']"};
        for (String xpath : xpaths) {
            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();
        }
    }

    private void handleIds(WebDriver driver) throws InterruptedException {
        String[] ids = {"add-to-cart-button", "sw-gtc", "a-autoid-0-announce", "quantity_10",};
        for (String id : ids) {
            WebElement element = driver.findElement(By.id(id));
            element.click();
        }
    }

    private void amount(WebDriver driver) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@name='quantityBox']"));
        element.sendKeys("15");
        element.click();
    }

    private void updateAmount(WebDriver driver) throws InterruptedException {
        WebElement element = driver.findElement(By.id("a-autoid-1-announce"));
        element.click();
    }

    private void emptyTheCart(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Delete']")));
        delete.click();
    }

}
