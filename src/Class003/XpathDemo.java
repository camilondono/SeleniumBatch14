package Class003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // goto fav=cebook
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("CamiCasi");
        Thread.sleep(1000);
        //click on forfot password
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();


    }

}
