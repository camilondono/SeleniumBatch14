package Class008;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitsDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to this website

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        //click on the button "change text to selenium webDriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();
        // get the text Selenium webDriver
        WebElement webDriver = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        webDriver.click();
        //print out text on the screen
        System.out.println(webDriver.getText());

        // task2
        // click on the button display  text after 10 seconds

        WebElement button2 = driver.findElement(By.xpath("display-other-button"));
        button2.click();

        //as button appears up after some time so in order to click on it or get text
        //we need to define some explicit wait
         WebDriverWait wait=new WebDriverWait(driver,20);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));


        WebElement visibleBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleBtn.click();




    }
}
