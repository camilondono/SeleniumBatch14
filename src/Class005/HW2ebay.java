package Class005;

import com.google.common.collect.Tables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2ebay {
    /*  1.Go to ebay.com
    2.get all the categories and print them in the console (in search bar you will see catogeries
     mentioned as dropdown)
    3.select Computers/Tables & Networking
    4.click on search
    5.verify the title*/
  public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.ebay.com/");
      driver.manage().window().maximize();
      WebElement allCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));
      Select sel = new Select(allCategories);
      List<WebElement> options = sel.getOptions();
        for(WebElement category : options){
            String value= category.getText();
            System.out.println(value);
        }
        sel.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.xpath("//input[@type='submit']"));
        String title = driver.getTitle();
      System.out.println("the title is: "+title);{
          if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
              System.out.println("Title verified");
          }else{
              System.out.println("title is not verified");
          }
          Thread.sleep(5000);
          driver.quit();
      }

  }
}
