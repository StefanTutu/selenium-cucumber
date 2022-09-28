//package ro.deloitte.ui;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
//
//import java.time.Duration;
//
//public class Exercitii {
//
//    private WebDriver driver;
//
//    private String wordToBePrinted;
//
//    @Before()
//    public void startDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//    }
//
//    @After()
//    public void quitDriver() {
//        driver.quit();
//    }
//
//    //scenariul nr1
//    @Given("^I navigate to (.*)$")
//    public void accesURL(String url) {
//        driver.get(url);
//    }
//
//    @When("^I click the first button$")
//    public void clickFirstButton() {
//        driver.findElement(By.id("alertexamples")).click();
//    }
//
//
//    //scenariul nr2
//    @When("^I click on second button$")
//    public void clicksecondButton() {
//        driver.findElement(By.id("confirmexample")).click();
//    }
//
//    @When("^I confirm the alert$")
//    public void ConfirmAlert() {
//        driver.switchTo().alert().accept();
//    }
//
//    @Then("^the text: (.*) appears on the page$")
//    public void assertTextInPage(String textToConfirm) {
//        WebElement textToConfirmElement;
//        String xpath = "//p[contains(text(), '%s')]";
//        textToConfirmElement =
//                driver.findElement(By.xpath(String.format(xpath, textToConfirm)));
//        Assert.assertTrue(textToConfirmElement.isDisplayed());
//
//    }
//
//    @When("^I click the third button$")
//    public void clickThirdButton() {
//        driver.findElement(By.id("promptexample")).click();
//    }
//
//    @When("^I click on Show Alert Box$")
//    public void clickOnShowAlertBox() throws InterruptedException {
//        driver.findElement(By.id("fakealert")).click();
//
//    }
//}
