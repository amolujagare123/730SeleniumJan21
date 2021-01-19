import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillingDemoCSS {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://billing.scriptinglogic.net/");

       WebElement txtUser = driver.findElement(By.cssSelector("input#email")); // using id
       txtUser.sendKeys("amolujagare@gmail.com");

       WebElement txtPassword = driver.findElement(By.cssSelector("input#password"));
       txtPassword.sendKeys("admin123");

       WebElement btnLogin = driver.findElement(By.cssSelector("input.btn")); // using class name
       btnLogin.click();




    }

}
