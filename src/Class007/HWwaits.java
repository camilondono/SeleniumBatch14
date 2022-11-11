package Class007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HWwaits {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        // clicl on start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        //Thread.sleep(4000);
        startBtn.click();

        //get text
        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies"));
        System.out.println(textElement.getText());

    }
}
