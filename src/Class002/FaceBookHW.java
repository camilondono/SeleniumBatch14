package Class002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookHW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Camilo");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Londono");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("Camilomail@syntax.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Camilomail@syntax.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.id("month")).sendKeys("December");
        Thread.sleep(1000);
        driver.findElement(By.id("day")).sendKeys("16");
        Thread.sleep(1000);
        driver.findElement(By.id("year")).sendKeys("1984");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.quit();


    }
}
