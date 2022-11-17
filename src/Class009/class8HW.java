package Class009;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class class8HW {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        // username
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        Thread.sleep(2000);
        userName.sendKeys("admin");
        //password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        // log in button
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        // click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        pimBtn.click();
        // click on employee list
        WebElement empList = driver.findElement(By.xpath("//a[text()='Employee List']"));
        empList.click();
        List<WebElement> columnId = driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]"));
        //traverse throughout the page
        for(int i=0; i<columnId.size();i++){
            String text=columnId.get(i).getText();
            if(text.equalsIgnoreCase("44965A")){
                System.out.println("the index is: "+(i+1));
                // click on the checkBox
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i + 1)+"]/td[1]"));
                checkBox.click();
            }
        }


    }
}
