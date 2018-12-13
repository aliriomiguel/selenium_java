import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class TecAdminSeleniumTest {
 
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("https://www.conectate.com.do/");

                List<WebElement> sorteos = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td"));
                List<String> valores = new ArrayList<>();


 
                Thread.sleep(1000);
 
                /*if (driver.getPageSource().contains("Me siento con suerte")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }*/
                driver.quit();
        }
}