package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class mobileTest {

    public static void main(String[] args) throws InterruptedException {


            Map<String, String> mobileEmulation = new HashMap<>();

            mobileEmulation.put("deviceName", "iPhone 8");

           System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://appdev03.healthfusion.local:7021/electronic/userlogin.jsp");

            Thread.sleep(4000);
            driver.findElement(By.id("username")).sendKeys("mu3auto_doctor_epcs");
            driver.findElement(By.id("password")).sendKeys("Password123");


            driver.findElement(By.xpath("//*[@id='frmButtons']/input[@type='submit']")).click();
            Thread.sleep(4000);
            System.out.println(driver.getCurrentUrl());

              driver.findElement(By.xpath("//a/div[@class='RxIcon']")).click();
             driver.findElement(By.id("patientNameSrc")).sendKeys("Test,QA", Keys.ENTER);


        }

}
