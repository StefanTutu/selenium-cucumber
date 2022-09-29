package ro.deloitte.ui;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.security.util.Password;

import java.time.Duration;
import java.util.List;

public class Proiect {

    private WebDriver driver;

    private String wordToBePrinted;

    @Before()
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @After()
    public void quitDriver() {
        driver.quit();
    }

    @Given("^I navigate to (.*)$")
    public void accesURL(String url) {
        driver.get(url);
    }

    @And("^I input text: (.*) in the (.*) input field$")
    public void inputTextInField(String accesName) {
        driver.findElement(By.name(accesName)).sendKeys(accesName);
    }

    @When("^I input text:(.*)in the Username input field$")
    public void enteringUsername(String Username) {
        driver.findElement(By.name("username")).sendKeys(Username);
    }

    @And("^I input text:(.*) in the Password input field$")
    public void inputTextInField2(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("^I click an element by the link text: (.*)$")
    public void clickElementbyLinkText(String checkbox) {
        driver.findElement(By.cssSelector("input[value='cb3']")).click();

        String lastDigit = checkbox.substring(checkbox.length() - 1);
        String checkBoxToBeSelected = "input[value='cb" + lastDigit + "']";
        driver.findElement(By.cssSelector(checkBoxToBeSelected)).click();

    }

    @And("^I click the radio button with label: (.*)$")
    public void clickRadioButton(String radiobox) {
        driver.findElement(By.cssSelector("input[value='rd3']")).click();
        String lastDigit = radiobox.substring(radiobox.length() - 1);
        String checkBoxToBeSelected = "input[value='rd" + lastDigit + "']";
        driver.findElement(By.cssSelector(checkBoxToBeSelected)).click();
    }

    @And("^I select the options (.*) and (.*) in the Multiple Select Values drop down menu$")
    public void selectOptionFromDropDown(String firstOption, String secondOption) {

        String valueOfFirstOption = "ms" + firstOption.substring(firstOption.length() - 1);
        String valueOfSecondOption = "ms" + secondOption.substring(secondOption.length() - 1);

        Select multipleSelect = new Select(driver.findElement(By.name("multipleselect[]")));
        multipleSelect.selectByValue(valueOfFirstOption);
        multipleSelect.selectByValue(valueOfSecondOption);
    }

    @And("^I select the option (.*) in the Dropdown drop down menu$")
    public void selectDropDownOption(String option) {
        WebElement selectDropDownOption = driver.findElement(By.name("dropdown"));
        Select selectList = new Select(selectDropDownOption);
        String lastDigit = option.substring(option.length() - 1);

        selectList.selectByValue("dd" + lastDigit);
    }

    @When("^I click on submit button$")
    public void clickSubmitbutton() {
        driver.findElement(By.xpath("//input[@value='submit']")).click();
    }

    //asserts
    @Then("^The expected username is (.*)$")
    public void assertingUsername(String Username) {
        Assert.assertEquals(Username, driver.findElement(By.id("_valueusername")).getText());
    }

    @And("^The expected password is (.*)$")
    public void assertingPassword(String Password) {
        Assert.assertEquals(Password, driver.findElement(By.id("_valuepassword")).getText());
    }

    @And("^The expected checkbox is (.*)$")
    public void assertingCheckBox(String check) {
        List<WebElement> elementList = driver.findElements(By.xpath("//li[contains(@id,'_valuecheckboxes')]"));
        Assert.assertEquals(1, elementList.size());
        String expected = check.substring(check.length()-1);
        for (WebElement element : elementList) {
            if (element.getText().equals(("cb") + expected)) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
    }

    @And("^The expected radio button is (.*)$")
    public void assertingRadioButton(String check) {
        List<WebElement> elementsList = driver.findElements(By.xpath("//li[contains(@id,'_valueradioval')]"));
        for (WebElement element : elementsList) {
            if (element.getText().equals(("rd") + check)) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
    }

    @And("^The expected selected multiple value is (.*)$")
    public void assertingMultipleCheck(String check) {
        List<WebElement> elementsList = driver.findElements(By.xpath("//li[contains(@id,'_valuemultipleselect0')]"));
        for (WebElement element : elementsList) {
            if (element.getText().equals(("ms") + check)) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
    }

    @And("^The expected dropdown option is (.*)$")
    public void assertingDropdownCheck(String check) {
        List<WebElement> elementsList = driver.findElements(By.xpath("//li[contains(@id,'_valuedropdown')]"));
        for (WebElement element : elementsList) {
            if (element.getText().equals(("dd") + check)) {
                Assert.assertTrue(true);
            }
        }
    }

    @Then("^The expected username appears as no value for username$")
    public void assertingUsernameBlank() {
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='No Value for username']")).isDisplayed());
    }

    @And("^The expected password appears as no value for password$")
    public void assertingPasswordBlank() {
        Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='No Value for password']")).isDisplayed());
    }
}
//    @And("^The expected password is (.*)$")
                //    public void assertingPassword(String Password) {
                //        Assert.assertEquals(Password, driver.findElement(By.id("_valuepassword")).getText());
                //    }
////wait for page to load
//
//    //usernamecheck
//    @Then("^I wait and check fields for submit action$")
//    public void checks_input() {
//        String actualUsername = driver.findElement(By.id("username")).getText();
//        String expectedUsername = "Elena";
//        Assert.assertEquals(actualUsername, expectedUsername);
//
//        //passwordcheck
//        String actualPassword = driver.findElement(By.id("valuepassword")).getText();
//        String expectedPassword = "Password123";
//        Assert.assertEquals(actualPassword, expectedPassword);
//
//        //comment check
//        Assert.assertTrue(driver.findElement(By.name("comments")).isDisplayed());
//        String actualComment = driver.findElement(By.id("valuecomments")).getText();
//        String expectedComment = "comments";
//        Assert.assertEquals(actualComment, expectedComment);
//    }

// checkbox checks
//        Assert.assertTrue(driver.findElement)
//        Assert.assertTrue(driver.findElement(By.name("_checkboxes")).isDisplayed());
//        String actualFirstCheckBox = driver.findElement(By.id("valuecheckboxes0")).getText());
//        String expectedFirstCheckBox = "cb3";
//        Assert.assertEquals(actualComment, expectedComment);
//    }
//}
//
//
