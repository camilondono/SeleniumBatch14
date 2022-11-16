package Class005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxesDemo {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        // find all the check boxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //traverse through list of checkboxes to find the desire one
        for (WebElement checkBox : checkBoxes) {
            //get the attribute value to check if this is the right option to select
            String optionName = checkBox.getAttribute("value");
//            if condition to make sure it is the right checkbox
            if (optionName.equalsIgnoreCase("Option-2")) {
                Thread.sleep(2000);
//                if passed click on it
                checkBox.click();
            }


        }

    }
}

