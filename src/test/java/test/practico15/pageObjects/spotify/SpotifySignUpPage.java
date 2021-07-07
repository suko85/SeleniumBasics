package test.practico15.pageObjects.spotify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifySignUpPage {

    WebDriver driver;

    public SpotifySignUpPage(WebDriver aDriver){
        this.driver = aDriver;
    }

    public void fillingResgistrationForm(){
        driver.findElement(By.id("email")).sendKeys("testing@test.com");
        driver.findElement(By.name("confirm")).sendKeys("testing@test.com");
        driver.findElement(By.name("password")).sendKeys("holamundo123");
    }

    public void clickOnRegistrationButton(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public WebElement monthErrorMsg(){
        WebElement monthError = driver.findElement(By.xpath("//*[contains(text(), 'Indica un día del mes válido.')]"));
        return monthError;
    }

}
