package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementSDemo2 {


    public static void main(String[] args) throws InterruptedException {
        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();
        // open a url
        driver.get("https://scriptinglogic.org");

        List<WebElement> btnList =  driver.findElements(By.className("elementor-button-text"));

        System.out.println("total button="+btnList.size());

        // element.getText() - returns the text present in the webelement

     /*   System.out.println(btnList.get(0).getText());
        System.out.println(btnList.get(1).getText());
        System.out.println(btnList.get(2).getText());
        System.out.println(btnList.get(3).getText());
        System.out.println(btnList.get(4).getText());
        System.out.println(btnList.get(5).getText());*/

        for(int i=0;i<btnList.size();i++)
            System.out.println(btnList.get(i).getText());





    }

}
