package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomXpath1 {

    String a = "abc";
    String b = "abc";

    public CustomXpath1(String a)
    {
        this.a = a;
        this.b = a;
    }



    public static void main(String[] args) {

        try
        {
            System.exit(1);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("finally after system.exit");
        }

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // 1.open the browser
        driver.get("https://app.hubspot.com/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // htmltag[@prop1='value']
        // input[@id='username']

        // htmltag[@prop1 ='value' and @prop2='value']
        // input[@class='form-control private-form__control login-email']

        // contains in Xpath
        // htmltag[contains(@prop1,'value')]
        // input[contains(@class,'login-email')]
        // input[@id ='username'and contains(@class,'login-email')]
        // input[@id ='u(@class,'')]

        // (//input[contains(@class,'form-control')])[1]
        // (//input[contains(@class,'form-control')])[2]

        // (//input[contains(@class,'form-control')])[position()=1]
        // (//input[contains(@class,'form-control')])[position()=2]

        // (//input[contains(@class,'form-control')])[last()]

        //(//i18n-string)[1]

        //xpath to click on second webelement
        //  (//span[.='Proceed'])[2]

        //text in Xpath
        //htmltag[text()='value']
        //  //i18n-string[text()='Forgot my password']

        //i18n-string[text()="Don't have an account?"] -- when there is a single quote in between text then
        //we need use "" within the xpath in order to find element as above example

        // htmltag[starts-with(@prop1,'value')]
        //span[@starts-with(@class,'account')]
        //span[@starts-with(text(),'Greet')]

        //*[@id='username']
        //input[@id='username']

        //div//input  -- direct + indirect child
        //div/input  -- direct child

    }

}
