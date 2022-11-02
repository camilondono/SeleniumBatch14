package Class004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // go to syntax projects.com simple form demo
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        // get the WebElement text box
        //driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadabra");
        WebElement textbox =driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textbox.sendKeys("Abracadabra");
        // press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();


    }

}
