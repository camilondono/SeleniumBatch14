package Class004;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HWTwo {
    public static void main(String[] args) {

        /*HW 2
        HRMS Application Negative Login:
        Open chrome browser
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text “Password cannot be empty” is displayed.

        Hint:
        you can use if else condition for verification of message*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // log in to syntax HR
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //locate username
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Camicasi");
        //locate login and click it
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        // Welcome Admin
        WebElement msg= driver.findElement(By.cssSelector("span#spanMessage"));
        //get text
        String text =msg.getText();
        // text message display
        if(msg.isDisplayed()){
            System.out.println("The message is displayed: "+text);
        }else{
            System.out.println("The message is unable to display");
        }


    }
}
