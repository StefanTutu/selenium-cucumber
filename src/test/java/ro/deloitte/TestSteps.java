package ro.deloitte;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.ArrayList;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSteps {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("basicpagetest")).click();

        String namePara = driver.findElement(By.id("para1")).getText();
        System.out.println(namePara);

        driver.navigate().back();
        driver.findElement(By.id("javascriptfieldvalidationtest")).click();
        driver.findElement(By.id("lteq30")).sendKeys("29");
        driver.findElement(By.name("submitbutton")).click();

        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.id("alerttestjs")).click();
        driver.findElement(By.id("alertexamples")).click();
        driver.switchTo().alert().accept();

        driver.navigate().back();
        driver.findElement(By.id("framestest")).click();
        driver.switchTo().frame("left");

        List<WebElement> list = driver.findElements(By.tagName("li"));

        for (WebElement element : list) {
            System.out.println(element.getText());
        }
        driver.navigate().back();
        driver.findElement(By.id("basicajaxtest")).click();
        Select dropdown1 = new Select(driver.findElement(By.id("combo1")));
        Select dropdown2 = new Select(driver.findElement(By.id("combo2")));
        dropdown1.selectByVisibleText("Desktop");
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("ajaxBusy"))));
        dropdown2.selectByVisibleText("C");
        driver.findElement(By.xpath("//input[@name='submitbutton']")).click();


        driver.quit();






    }

}