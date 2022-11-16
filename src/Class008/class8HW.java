package Class008;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class class8HW {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to this website
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        // click on the text Box
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        // click remove button
        WebElement removeBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();
        // verify the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message'] "));
        System.out.println("text verification is: "+text.getText());
        WebDriverWait wait = new WebDriverWait(driver,20);
        // click on the Enable button
        WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();
        //verify the button in now disable
        WebElement disableButton = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(("Verification of enable: "+disableButton.getText()));
        // enter text
        WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
        textbox2.sendKeys("Camicasi");
        WebDriverWait wait2 = new WebDriverWait(driver,20);
        // click on disable
        WebElement disbalebtn2 = driver.findElement(By.xpath("//button[text()='Disable']"));
        disbalebtn2.click();
        // verify the button is now disbale and get text
        WebElement disableBtnText = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("Verification of disbale button: "+disableBtnText.getText());


    }
}
