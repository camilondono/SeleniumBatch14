package Class002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        //enter user name in text box
        //1 locate element ad send keys
        driver.findElement(By.id("email")).sendKeys("Camilondono1216");
        //enter password in thext box
        driver.findElement(By.name("pass")).sendKeys("abd123");

        //click to log in
        driver.findElement(By.name("login")).click();  //comment all line 24 so the next 3 task can work.

        //task 2
        //click on forgot password
        //driver.findElement(By.linkText("Forgot password?")).click();

        //task 3
        //click on forgot password using Partial linktext locator
        //driver.findElement(By.partialLinkText("Forgot ")).click();





    }

}
