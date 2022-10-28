package ReviewClass001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
//      setting up the driver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//      create an instance
        WebDriver driver=new ChromeDriver();
//      open up facebook web page
        driver.get("https://www.facebook.com/");
//      maximize the window
        driver.manage().window().maximize();
//      before closing browser wait for 5 seconds
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
//      send your first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Camicasi");
        Thread.sleep(2000);
//      send last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Alpavimento");
        Thread.sleep(2000);
//      close the window
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();



//      quit the browser
//        driver.quit();


    }


}
