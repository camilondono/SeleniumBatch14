package Class005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // maximize the window
        driver.manage().window().maximize();
        // find the webElement dropdown by looking for select tag
        WebElement dropdown= driver.findElement(By.xpath("//select[@id='select-demo']"));
        // use select class
        Select select = new Select(dropdown);
        // select an option by index
        select.selectByIndex(5);
        // select by visible text
        Thread.sleep(4000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(4000);
        // select by value
        select.selectByValue("Sunday");

        // get all the options available to us in the dropdown
        List<WebElement> options=select.getOptions();
        // traverse through the options
        for(int i=0;i<options.size();i++){
            WebElement option=options.get(i);
           // System.out.println(option.getText()); // commented out
            String text = option.getText();
            if(text.equalsIgnoreCase("Friday")){
                Thread.sleep(3000);
                select.selectByIndex(i);
            }

        }


    }
}
