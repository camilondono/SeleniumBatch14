package Class007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //Switch the focus of driver  to the parent whose id is frame1
        driver.switchTo().frame("frame1");
        //switch focus of the child frame
        driver.switchTo().frame(0);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        //switch the focuc back to home content
        driver.switchTo().defaultContent();

        // swithcing to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

        //find the select tag
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel = new Select(dropdown);
        Thread.sleep(4000);
        sel.selectByIndex(3); // select avatar

        driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input")).sendKeys("Camicasi");

    }
}
