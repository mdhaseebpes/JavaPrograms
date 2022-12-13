package Collection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class ListWithStreamAndFilter {

    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        By links  = By.tagName("a");

      List<WebElement> linkList = driver.findElements(links);
        System.out.println(linkList.size());

     List<String> collectList = linkList.stream()
             .filter(ele -> !ele.getText().isEmpty())
             .filter(ele -> !ele.getText().startsWith(" "))
             .map(ele -> ele.getText())
              .collect(Collectors.toList());

     collectList.stream().forEach(ele -> System.out.println(ele));
     collectList.parallelStream().forEach(ele -> System.out.println(ele));


    }
}
