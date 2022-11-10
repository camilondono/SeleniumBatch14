package Class007;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();
        //get the window handle
        String gmailHandle=driver.getWindowHandle();  // save it on a String
        //print it on screen
        System.out.println("The handle of current page is: "+gmailHandle);
        // the window handle is dinamic and will print differently every time we run it.

    }

}
