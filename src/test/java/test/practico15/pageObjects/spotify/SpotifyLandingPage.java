package test.practico15.pageObjects.spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpotifyLandingPage {

    WebDriver driver;
    public SpotifyLandingPage(WebDriver aDriver){
        driver = aDriver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public SpotifySignUpPage clickOnSignUp(){
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();
        return new SpotifySignUpPage(driver);

    }
}
