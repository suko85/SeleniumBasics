package test.practico15.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.practico15.pageObjects.spotify.SpotifyLandingPage;
import test.practico15.pageObjects.spotify.SpotifySignUpPage;

import java.util.concurrent.TimeUnit;

public class SpotifyTest {

    private static String SPOTIFY_URL = "http://www.spotify.com";
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(SPOTIFY_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void registrationTest() throws InterruptedException {
        // System.out.println("Titulo " + driver.getTitle());

        SpotifyLandingPage spotifyLandingPage = new SpotifyLandingPage(driver);
        String title = spotifyLandingPage.getTitle();
        Assert.assertEquals(title, "Escuchar es todo - Spotify");

        SpotifySignUpPage spotifySignUpPage =  spotifyLandingPage.clickOnSignUp();

        spotifySignUpPage.fillingResgistrationForm();
        spotifySignUpPage.clickOnRegistrationButton();

        Thread.sleep(3000);

        //WebElement profileErrorName = driver.findElement(By.xpath("//*[contains(text(), 'Introduce un nombre para tu perfil.')]"));
        //Assert.assertEquals(profileErrorName, "Introduce un nombre para tu perfil.");

        WebElement monthErrorName = spotifySignUpPage.monthErrorMsg();
        Assert.assertEquals(monthErrorName.getText(), "Indica un día del mes válido.");

        //WebElement yearErrorName = driver.findElement(By.xpath("//*[contains(text(), 'Indica un año válido.')]"));
        //Assert.assertEquals(yearErrorName, "Indica un año válido.");




    }

}
