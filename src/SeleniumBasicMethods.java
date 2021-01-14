import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicMethods {


    public static void main(String[] args) {

        // open a browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://facebook.com");

        driver.navigate().to("http://gmail.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }

}
