package Class002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // go to smartbear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize window
        driver.manage().window().maximize();
        //enter the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click log in
        driver.findElement(By.className("button")).click();

        // Make sure the title is correct i.e Web Orders  "inspect and on top ypu will find <title>

        //get title of the page
        String title=driver.getTitle();
        //System.out.println(title); commented out after comfirming it works
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct "+title);
        }else{
            System.out.println("The title is incorrect "+title);
        }


    }

}
