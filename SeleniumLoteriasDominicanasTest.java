import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class SeleniumLoteriasDominicanasTest {
 
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("https://loteriasdominicanas.com/");

                //List<WebElement> sorteos = new ArrayList<>();xpath=////div[@id='conectate_lottery-2']/table/tbody/tr/td/span

                List<WebElement> sorteos = driver.findElements(By.xpath("//div[3]//div[2]//span"));

                //List<WebElement> sorteos = driver.findElement(By.xpath("//tr[5]/td[2]/span[3]"));
                List<String> valores = new ArrayList<>();

                for(WebElement sor : sorteos){
                //ele.sendKeys("hexbyes");
                System.out.println(sor.getText());
                //System.out.println(ele.getAttribute("id"));
                //System.out.println(ele.getTagName());
                } 
 
                Thread.sleep(1000);
 
                /*if (driver.getPageSource().contains("Me siento con suerte")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }*/
                driver.quit();
        }
}