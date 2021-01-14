import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://lifepartner.in");

        // 1. find the webelement
        WebElement drpMStatus = driver.findElement(By.name("ms"));

        //2. create object of select
        Select selMStatus = new Select(drpMStatus);

        // 3. do the selection

    //    selMStatus.selectByVisibleText("Never married");

      //  selMStatus.selectByValue("7");

        selMStatus.selectByIndex(1);
    }

}
