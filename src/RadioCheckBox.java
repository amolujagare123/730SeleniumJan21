import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement selSelenium = driver.findElement(By.id("check1"));
        selSelenium.click();

        WebElement radCucumber = driver.findElement(By.id("rad2"));
        radCucumber.click();



    }

}
