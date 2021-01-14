import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement selJava = driver.findElement(By.id("check0")); // untick
        WebElement selSelenium = driver.findElement(By.id("check1")); // tick
        WebElement selCucumber = driver.findElement(By.id("check2")); // tick

        if(selJava.isSelected())
            selJava.click();

        if(!selSelenium.isSelected())
            selSelenium.click();

        if(!selCucumber.isSelected())
            selCucumber.click();



    }

}
