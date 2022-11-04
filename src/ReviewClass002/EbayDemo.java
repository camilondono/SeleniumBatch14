package ReviewClass002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        //select form drop down
        WebElement dropdwn = driver.findElement(By.xpath("//select[@id=' gh-cat']"));
        Select sel=new Select(dropdwn);
        sel.selectByValue("58058");
        driver.findElement(By.xpath("//input[@type='submit']"));
        //verify the title
        //WebElement title = driver.findElement(By.xpath("//title"));
        String title = driver.getTitle(); // also gets the tittle
        // String titleText = title.getText();
        if(title.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay")){
            System.out.println("thetitle is verified");
        }else{
            System.out.println("the title is incorrect");
        }




    }
}
