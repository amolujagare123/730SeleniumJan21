import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementSDemo {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        List<WebElement> inputList =  driver.findElements(By.tagName("input")); // 3

        System.out.println(inputList.size());

        inputList.get(0).sendKeys("admin");
        inputList.get(1).sendKeys("admin");
        inputList.get(2).click();

    /*
Textuser
Txtpass
btnlogin
*/






    }

}
