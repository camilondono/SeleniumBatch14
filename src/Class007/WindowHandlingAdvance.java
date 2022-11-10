package Class007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");
        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacybtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacybtn.click();
       //the tittle for my desire page is Google Account Help

        //get all the window handles
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
        // switching the focus to the current handle from list
        driver.switchTo().window(handle)  ;
        //get the title for the window in which the driver has switch
            String tittle = driver.getTitle();
        // compare if title is of the help page
        if(tittle.equalsIgnoreCase(("Google Account Help")))    {
            System.out.println("The current page under focus is: "+tittle);
            break;
        }


        }
        //find the community btn and click on it
        WebElement communitybtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communitybtn.click();


    }
}
