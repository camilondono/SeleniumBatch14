package ReviewClass001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWReviseSyntax {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//      open syntax
        driver.get("http://syntaxprojects.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
//      click on starts practicing
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hundreds and fitties");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")).click();
        Thread.sleep(4000);
        driver.quit();

    }

}
