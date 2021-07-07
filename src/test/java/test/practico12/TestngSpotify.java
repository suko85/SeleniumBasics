package test.practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSpotify {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com");
    }
    @Test (priority = 3)
    public void test1(){
        System.out.println("This is a test");

        System.out.println("Title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Escuchar es todo - Spotify");
    }

    @Test (priority = 2)
    public void verifySignupUrl(){
        driver.findElement(By.xpath("/html/body/div[2]/div/header/div/nav/ul/li[5]/a")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("uy/signup/"));
    }

    @Test (priority = 0)
    public void invalidEmailTest(){
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Introduce tu correo electrónico.']"));
        email.sendKeys("test.com");

        WebElement emailConfirmationField = driver.findElement(By.name("confirm"));
        emailConfirmationField.sendKeys("testing");

        WebElement emailErrorMsg = driver.findElement(By.xpath("//span[contains(text(), 'Este correo electrónico no es válido')]"));
        Assert.assertEquals(emailErrorMsg.getText(), "Este correo electrónico no es válido. Asegúrate de que tenga un formato como este: ejemplo@email.com");
    }

    @Test (priority = 1)
    public void validateExistingEmail() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Introduce tu correo electrónico.']"));
        email.sendKeys("test@test.com");
        WebElement emailConfirmationField = driver.findElement(By.name("confirm"));
        emailConfirmationField.sendKeys("testing");
        Thread.sleep(2000);
        WebElement emailErrorDuplicate = driver.findElement(By.xpath("//span[contains(text(), 'Este correo electrónico ya está conectado a una cuenta.')]"));
        Thread.sleep(2000);
        Assert.assertEquals(emailErrorDuplicate.getText(), "Este correo electrónico ya está conectado a una cuenta. Inicia sesión.");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


}
