import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        // 1. find the webelement
        WebElement drpText = driver.findElement(By.id("multiSel"));

        //2. create object of select
        Select selText = new Select(drpText);

        // 3. selection

        Thread.sleep(4000);
        selText.selectByVisibleText("text 1");

        Thread.sleep(4000);
        selText.selectByVisibleText("text 3");

        Thread.sleep(4000);
        selText.selectByVisibleText("text 4");

        Thread.sleep(4000);
       // selText.deselectByVisibleText("text 3");
        selText.deselectAll();


    }
    }
