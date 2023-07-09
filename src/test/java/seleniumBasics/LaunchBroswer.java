package seleniumBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class LaunchBroswer {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();    //autoboxing
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        TakesScreenshot screenshot = (TakesScreenshot)driver; //un-boxing
        File temp =screenshot.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir")+"\\firstFile.png");
        FileUtils.copyFile(temp,file);
    }
}
