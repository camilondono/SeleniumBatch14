package Class005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1facebook {
    /*1.Go to facebook
    2.click on create New Account
    3.Fill out the whole form
    4.Take screen shot of filled out form manually and share in HW channel along with code*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@role='button' and @rel='async']"));
        createNewAccount.click();
        Thread.sleep(2000);
        // name, last name, email, password
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Camilo");
        driver.findElement(By.name("lastname")).sendKeys("Londono");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Camilo@Syntaxtechs.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Camilo@Syntaxtechs.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password123");
        // dropdown
        WebElement dropdown = driver.findElement(By.id("month"));
        Select sel = new Select(dropdown);
        sel.selectByIndex(11);
        WebElement dropdownn = driver.findElement(By.name("birthday_day"));
        Select sell= new Select(dropdownn);
        sell.selectByIndex(16);
        WebElement dropdownnn = driver.findElement(By.id("year"));
        Select selll = new Select(dropdownnn);
        selll.selectByValue("1984");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.quit();




    }

}
