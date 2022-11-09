package Class006;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWone {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");

        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement animals=driver.findElement(By.id("animals"));

        Select select=new Select(animals);
        select.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Done");




    }
}
