package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {


    public static void main(String[] args) {

        // open a browser
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://facebook.com");



    }

}
