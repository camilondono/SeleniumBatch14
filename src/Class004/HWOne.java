package Class004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWOne {
    public static void main(String[] args) {
        /*HW1
        Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify the message "Welcome Admin " is there on the top right corner*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // go to url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //enter username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        //check message
        WebElement welcomein = driver.findElement(By.id("welcome"));
        if(welcomein.isDisplayed()){
            System.out.println("display message: "+welcomein.getText());
        }else{
            System.out.println("There is no message to be displayed");
        }


    }
}
