package test.practico13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class spotifyTestRefactoring {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com");
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void spotifyTest(){
        SpotifyFillingRegistrationForm registrationForm = new SpotifyFillingRegistrationForm(driver);
        registrationForm.clickOnElementByXpath("//a[@href='https://www.spotify.com/uy/signup/']");
        registrationForm.fillingForm();
        registrationForm.clickOnElementByXpath("//button[@type]");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Confirma que no eres un robot.')]")));

        WebElement robotMsgError = driver.findElement(By.xpath("//*[contains(text(), 'Confirma que no eres un robot.')]"));
        Assert.assertEquals(robotMsgError.getText(), "Confirma que no eres un robot.");
        Assert.assertFalse(robotMsgError.getText().isEmpty());
        Assert.assertTrue(robotMsgError.getText().contains("robot"));
        Assert.assertTrue(robotMsgError.getText().startsWith("Confirma"));
        Assert.assertTrue(robotMsgError.getText().equals("Confirma que no eres un robot."));
    }

    @Test
    public void spotifyTestWithParameters(){
        SpotifyFillingRegistrationForm registrationForm = new SpotifyFillingRegistrationForm(driver);
        registrationForm.clickOnElementByXpath("//a[@href='https://www.spotify.com/uy/signup/']");
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        registrationForm.fillingForm("qa@selenium.com", "qa@selenium.com", "holamundo", "jperez");
        registrationForm.clickOnElementByXpath("//button[@type]");
        WebElement robotMsgError = driver.findElement(By.xpath("//*[contains(text(), 'Confirma que no eres un robot.')]"));
        Assert.assertEquals(robotMsgError.getText(), "Confirma que no eres un robot.");
        Assert.assertFalse(robotMsgError.getText().isEmpty());
        Assert.assertTrue(robotMsgError.getText().contains("robot"));
        Assert.assertTrue(robotMsgError.getText().startsWith("Confirma"));
        Assert.assertTrue(robotMsgError.getText().equals("Confirma que no eres un robot."));
    }

    @AfterMethod
    public void tearDown(){
        //driver.close();
    }
}
