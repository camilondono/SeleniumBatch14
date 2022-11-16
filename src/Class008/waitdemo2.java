package Class008;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitdemo2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to this website

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();

        //click on the button that pops up the alert
        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();
        // beacuse ww dont have a weblement associated with the alert in the DOM
        //so there is no purpose of using implicit wait (which waits for the weblement to be found)
        //so we use explicit wait in this scenarios

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        // handle the alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

    }
}
