package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class CustomXpath {


    static WebDriver driver;

    public static void dynamicwait(String xpath)
    {
        ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""+xpath+"")));
    }

    public static void selectcontact(WebDriver driver,String name)
    {
        dynamicwait("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input");
        driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input")).click();
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // 1.open the browser
        driver.get("https://app.hubspot.com/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        selectcontact(driver, "Haseeb");



        //Custom Xpath -- Xpath Axes

        // (//div[@class='input-group']//following::input)[1]
        //div[@class='input-group']//following::input[@name='username']
        //div[@class='input-group']//preceding::div
        //div[@class='input-group']//parent::div
        //div[@class='input-group']//child::input

        //web table contact
        //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input
        //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//following-sibling::td//input
        //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//following-sibling::td//child::input
        //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//following-sibling::td//child::input//parent::

        //ancestor::td//following-sibling::td//preceding-sibling::td//parent::input

        //cric info





    }
}
