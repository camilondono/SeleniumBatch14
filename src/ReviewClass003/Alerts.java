package ReviewClass003;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        // click on the button
        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
        Thread.sleep(2000);
        // alert interface
        Alert Alert1 = driver.switchTo().alert();
        Alert1.accept();
        //alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        Thread.sleep(2000);
        alertBtn3.click();

        // Reusing the alert already declared
        Alert1.sendKeys("Camicasi");
        Alert1.accept();

    }
}
