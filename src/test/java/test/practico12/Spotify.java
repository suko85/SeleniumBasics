package test.practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Utilities.GetProperties;

public class Spotify {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/");
    }

    @Test
    public void verifySignupUrl(){
      driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
      Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
    }

    @Test
    public void invalidEmailTest() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
        Thread.sleep(2500);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test.com");

        WebElement confirmEmail = driver.findElement(By.id("confirm"));
        confirmEmail.sendKeys("testing");
        Thread.sleep(2500);
        WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Este correo electrónico no es válido. Asegúrate de')]"));

        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void validateExistingEmail() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
        Thread.sleep(2500);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test@test.com");
        WebElement confirmEmail = driver.findElement(By.id("confirm"));
        confirmEmail.click();

        WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(), 'Este correo electrónico ya está conectado a una cuenta.')]"));
        Assert.assertTrue(errorMsg.isDisplayed());
    }

    @Test
    public void checkEqualEmailsError() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
        Thread.sleep(2500);
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("test999@test.com");

        WebElement confirmEmail = driver.findElement(By.id("confirm"));
        confirmEmail.sendKeys("hola@hola.com");

        WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(), 'Las direcciones de correo electrónico no coinciden.')]"));
        Assert.assertTrue(errorMsg.isDisplayed());
    }

    @Test
    public void checkErrorMessages(){

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
