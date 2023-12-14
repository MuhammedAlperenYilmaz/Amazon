import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com.tr");
        driver.manage().window().maximize();
        WebElement cookies=driver.findElement(By.id("sp-cc-accept"));
        cookies.click();
        org.openqa.selenium.WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Book");
        searchBox.submit();
        org.openqa.selenium.WebElement selectBook=driver.findElement(By.xpath("//img[@data-image-index='5']"));
        selectBook.click();
        org.openqa.selenium.WebElement addToCard=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCard.click();
        org.openqa.selenium.WebElement completeShopping=driver.findElement(By.xpath("//span[@id='sw-gtc']"));
        completeShopping.click();
        org.openqa.selenium.WebElement chooseAmount=driver.findElement(By.className("a-dropdown-prompt"));
        chooseAmount.click();
        org.openqa.selenium.WebElement selectMoreThanTen=driver.findElement(By.id("quantity_10"));
        selectMoreThanTen.click();
        org.openqa.selenium.WebElement newAmount=driver.findElement(By.xpath("//input[@name='quantityBox']"));
        newAmount.sendKeys("15");
        newAmount.click();
        org.openqa.selenium.WebElement updateButton=driver.findElement(By.id("a-autoid-1-announce"));
        updateButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        org.openqa.selenium.WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Sil']")));
        Thread.sleep(5000);
        delete.click();
        driver.close();
    }
}









