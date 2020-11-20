package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {

   static  String homepage = "https://www.wikihow.com/Play-Skribbl.io";

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection huc = (HttpURLConnection) link.openConnection();

            huc.setConnectTimeout(2000);
            huc.connect();

            if (huc.getResponseCode() == 200) {
                System.out.println(url + " -- " + huc.getResponseMessage());
            }

            if (huc.getResponseCode() >= 400) {
                System.out.println(url + "---" + huc.getResponseMessage());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(homepage);
       // driver.navigate(homepage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       /* WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
*/
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        Iterator<WebElement> it = list.iterator();

        while (it.hasNext()) {
            String url = it.next().getAttribute("href");
            System.out.println(url);

            if(!url.startsWith(homepage))
            {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            BrokenLinks.verifyLink(url);
        }


    }

}
