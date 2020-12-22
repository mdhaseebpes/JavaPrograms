package Selenium;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.sun.jna.platform.FileUtils.*;

public class Waits {

    

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("");
        // driver.navigate(homepage);
        driver.manage().window().maximize();

        /* WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));

        */

        Wait wait  = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleIs(""));

        Wait wait1 = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(Exception.class);
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("")));

        File screenshot  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(screenshot,new File(""));
    }
}
