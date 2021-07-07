package test.practico14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.DataProviders.SalesforceDataGenerator;

public class SalesforceTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test (dataProvider = "salesforceRegistration", dataProviderClass = SalesforceDataGenerator.class)
    public void salesforceRegistrationTest(String nombre, String apellido, String titulo, String email, String status) throws InterruptedException {
        driver.get("https://www.salesforce.com/mx/form/signup/freetrial-sales-pe/?d=70130000000EqoP");


        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Rodriguez");
        driver.findElement(By.name("UserTitle")).sendKeys("QA");
        driver.findElement(By.name("UserEmail")).sendKeys("testing@gmail.com");

        if (status.equals("success")){

        } else if (status.equals("failure")){
            //Assert.assertEquals();
        }

        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
