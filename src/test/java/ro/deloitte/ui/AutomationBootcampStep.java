//package ro.deloitte.ui;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Select;
//
//import java.sql.Driver;
//import java.time.Duration;
//
//public class AutomationBootcampStep {
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
//    @Given("The word {string} is set")
//    public void theWordIsSet(String wordToBeSet) {
//        wordToBePrinted = wordToBeSet;
//    }
//
//    @Given("The Deloitte Digital page is accessed")
//    public void accessDeloittePage() {
//        driver.get("https://www.deloittedigital.com/");
//    }
//
//    @And("^I wait to dismiss the cookies dialog$")
//    public void waitForCookiesAndDismiss() {
//
//        By acceptCookies = By.id("onetrust-accept-btn-handler");
//        //Declare amd initialise a fluent wait
//        FluentWait wait = new FluentWait(driver);
//        //Specify timeout of the wait
//        wait.withTimeout(Duration.ofMillis(5000));
//        //Specify what exception to ignore
//        wait.ignoring(NoSuchElementException.class);
//        //This is how we specif the condition of wait
//        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));
//        driver.findElement(acceptCookies).click();
//    }
//
//    @When("^I click an element by the link text: (.*)$")
//    public void clickElementbyLinkText(String linkText) {
//        driver.findElement(By.linkText(linkText)).click();
//    }
////
//    @And("^I input text: (.*) in the (.*) input field$")
//    public void inputTextInField(String text, String fieldLabel) {
//        String fieldXpath =
//                "//label[text() = '%s']/parent::div/parent::div/following-sibling::div/div/input[contains(@class,'form_field_text')]";
//        driver.findElement(By.xpath(String.format(fieldXpath, fieldLabel))).sendKeys(text);
//    }
//
//    @And("^I select the option: (.*) in the Topic drop down menu$")
//    public void selectDropDownOption(String option) {
//        Select select = new Select(driver.findElement(new By.ByTagName("select")));
//        select.selectByVisibleText(option);
//    }
//
//    @And("^I click the radio button with label: (.*)$")
//    public void clickRadioButton(String label) {
//        String radioXpath = "//input[@type='radio'][value='%s']";
//        driver.findElement(By.xpath(String.format(radioXpath, label))).click();
//
//    }
//
//    @When("I print it in the console")
//    public void whenIPrintItInTheConsole() {
//        System.out.println(wordToBePrinted);
//    }
//}
