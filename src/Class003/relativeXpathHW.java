package Class003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpathHW {

    public static void main(String[] args) throws InterruptedException {

        //Click on start practicing click on simple form demo enter any text on first text box
        //click on show message quit the browser

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[starts-with(@class,'list')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hundreds and fitties");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")).click();
        Thread.sleep(4000);
        driver.quit();




    }

}
