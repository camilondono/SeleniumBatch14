package ReviewClass002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        // find checkbpox
        // create a variable
        List<WebElement> checkbx = driver.findElements(By.xpath("//input[@name='color']"));
        //what doews this contains
        // contains all six web elements
        for(WebElement checkbxs:checkbx){
            String color= checkbxs.getAttribute("value");
            if(color.equalsIgnoreCase("Blue")){
                checkbxs.click();
                break;
            }
        }


    }
}
