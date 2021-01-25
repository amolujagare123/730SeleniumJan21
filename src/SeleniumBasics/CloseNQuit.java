package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseNQuit {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://naukri.com");

        Thread.sleep(2000);

        //driver.close();

        driver.quit();
    }

}
