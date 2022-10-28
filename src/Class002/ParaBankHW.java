package Class002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankHW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22;");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.name("customer.firstName")).sendKeys("Camilo");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Londono");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.street")).sendKeys("9876 Syntax Blvd");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("West Palm Beach");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.state")).sendKeys("Florida");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33401");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("987-654-3210");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("345-67-9876");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.username")).sendKeys("Camilondono");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("abc123");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
