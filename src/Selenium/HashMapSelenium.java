package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HashMapSelenium {

    static WebDriver driver;

    public static Map<String, String> userCredentials()
    {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("patient" , "patient_test1234");
        userMap.put("doctor" , "doctor_test1234");
        userMap.put("nurse" , "nurse_test1234");

        return userMap;

    }

    public static void login(Map<String, String> userMap,String user){

        driver.findElement(By.id("username")).sendKeys(userMap.get(user).split("_")[0]);
        driver.findElement(By.id("password")).sendKeys(userMap.get(user).split("_")[1]);
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");

        HashMapSelenium.login(userCredentials(),"doctor");


    }
}
