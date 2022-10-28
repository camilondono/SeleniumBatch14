package Class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
        // go to google.com
        // go to facebook.com
        //go back to goole.com

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create the Webdriver instance
        WebDriver driver=new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.facebook.com/");

        //introduce some sleep which is wait
        //wait or pause for 2000 milliSeconds =(2 seconds)
        Thread.sleep(2000);

        // go back to google.com
        driver.navigate().back();

        //wait for 2 seconds
        Thread.sleep(2000);
        // go back to facebook.com(fordward)
        driver.navigate().forward();

        // wai for 2 sec
        Thread.sleep(1000);
        // refresh the page
        driver.navigate().refresh();
        // to quit "exits all tabs"
        driver.quit();


    }

}
