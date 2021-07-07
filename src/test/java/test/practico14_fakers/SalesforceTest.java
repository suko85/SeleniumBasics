package test.practico14_fakers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Utilities.FakersFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SalesforceTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void salesforceRegistrationTest() {

        driver.get("https://www.salesforce.com/mx/form/signup/freetrial-sales-pe/?d=70130000000EqoP");

       /* Faker fakerGenerator = new Faker();
        System.out.println(fakerGenerator.job().field());
        System.out.println(fakerGenerator.job().keySkills());
        System.out.println(fakerGenerator.job().position());
        System.out.println(fakerGenerator.job().seniority());
        System.out.println(fakerGenerator.job().title());*/


        driver.findElement(By.name("UserFirstName")).sendKeys(FakersFactory.getFirstName());
        driver.findElement(By.name("UserLastName")).sendKeys(FakersFactory.getLastName());
        driver.findElement(By.name("UserTitle")).sendKeys(FakersFactory.getTitle());
        driver.findElement(By.name("UserEmail")).sendKeys(FakersFactory.getEmail());
    }

    @Test
    public void salesforceRegistrationEmptyFieldsErrorTest(){
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.id("signup_link")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("Start my free trial")).click();

        List<WebElement> errorMessagesList = driver.findElements(By.className("error-msg"));
         boolean isFirstNameErrorPresent = false;
         boolean isLastNameErrorPresent = false;
         boolean isTitleErrorPresent = false;

        for (WebElement element : errorMessagesList){
            System.out.println(element.getText());
            if (element.getText().equals("Enter your first name")){
                isFirstNameErrorPresent = true;
            } else if (element.getText().equals("Enter your last name")){
                isLastNameErrorPresent = true;
            } else if (element.getText().equals("Enter your title")){
                isTitleErrorPresent = true;
            }
        }

        Assert.assertTrue(isFirstNameErrorPresent);
        Assert.assertTrue(isLastNameErrorPresent);
        Assert.assertTrue(isTitleErrorPresent);

        driver.getWindowHandles();
    }



    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
