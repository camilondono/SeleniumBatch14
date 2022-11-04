package ReviewClass002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // maximise windows
        driver.manage().window().maximize();
        List<WebElement> radioButons = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //traverse through th list of webElements
        for(WebElement radioButon:radioButons){
            //find desired radio button
            String option = radioButon.getAttribute("value");
            if(option.equalsIgnoreCase("5 - 15")){
                radioButon.click();
            }
        }


    }

}
