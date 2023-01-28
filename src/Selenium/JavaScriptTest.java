package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://app.hubspot.com/login");

        Thread.sleep(5000);

        JavaScriptUtil.getTitleByJS(driver);

     //JavaScriptUtil.generateAlert(driver,"Test Alert");

        JavaScriptUtil.getBrowserinfo(driver);
        JavaScriptUtil.refreshBrowserByJS(driver);

        JavaScriptUtil.sendKeysUsingJSWithID(driver,"username","test");

        WebElement signUp = driver.findElement(By.linkText("Sign up"));
        JavaScriptUtil.clickElementByJS(driver,signUp);

        JavaScriptUtil.drawBorder(driver,signUp);


    }
}
