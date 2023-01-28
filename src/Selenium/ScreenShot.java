package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    WebDriver driver;
    private String getScreenshotPath(final String methodName) {
       //WebDriver driver = DriverFactory.getInstance().getDriverInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String ssFilePath = System.getProperty("user.dir") + File.separator + "screenshots"
                + File.separator + "failureSs" + File.separator + methodName + ".png";
        try {
            FileUtils.copyFile(screenshot, new File(ssFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ssFilePath;
    }
}
