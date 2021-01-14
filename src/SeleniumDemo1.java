import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo1 {


    public static void main(String[] args) {

        // open a browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

      /*  WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

        /*WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();*/

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://facebook.com");



    }

}
