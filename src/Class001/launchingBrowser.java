package Class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //get URL
        String url=driver.getCurrentUrl();

            //get title
       String title=driver.getTitle();
            //print the title
        System.out.println(title);
            // close chrome
        driver.quit();



    }
}
