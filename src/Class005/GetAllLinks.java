package Class005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // go to ebay
        driver.get("https://www.ebay.com/");
        // get all the links i.e anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        // print the size of the list
        System.out.println("The size of the list is :" + ebayLinks.size());
        // implementing a for loop to traverse through the list of elements
        for (WebElement ebaylink : ebayLinks) {
            // extracting the value of attribute href bc it contains the link embedded in the webelement
            String link= ebaylink.getAttribute("href");
            // print the link
            System.out.println(link);

        }

    }

}
