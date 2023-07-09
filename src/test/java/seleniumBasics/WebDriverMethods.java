package seleniumBasics;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;

public class WebDriverMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.out.println(driver.manage().window().getSize().getHeight());
        driver.manage().window().setSize(new Dimension(1100,640));
        System.out.println(driver.manage().window().getSize().getHeight());
        System.out.println(driver.manage().window().getSize().getWidth());
        driver.get("https://web.whatsapp.com/");
        if(driver.getCurrentUrl().contains("google.com")){
            System.out.println("Test is passed");
        }
        else{
            System.out.println("Test is Failed");
        }

    }
}
