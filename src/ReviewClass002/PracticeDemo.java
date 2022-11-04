package ReviewClass002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("txtUsername"));
        //send username
        userName.sendKeys("Admin");
        //then user send in the worng password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("wrongPassword");
        // users click on log in
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();
        // then VERIFY "INVALID CREDENTIALS"
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMsg.getText();
        // verificatiion
        if(error.equalsIgnoreCase("Invalid Credentials")){
            System.out.println("The correct error message is there --> verified");
        }else{
            System.out.println("The correct error message is not there");
        }

    }
}
