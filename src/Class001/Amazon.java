package Class001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        /*
        1. launch the browser
        2.navigate to amazon website
        3. print out the title and the url in the console.
*/
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver web=new ChromeDriver();
        web.get("https://www.amazon.com/");
        String title=web.getTitle();
        System.out.println(title);
        String url=web.getCurrentUrl();
        System.out.println(url);

    }
}


