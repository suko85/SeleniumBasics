package test.practico13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpotifyFillingRegistrationForm {

    WebDriver driver;
    public SpotifyFillingRegistrationForm(WebDriver aDriver){
        this.driver = aDriver;
    }

    public void clickOnElementByXpath(String xpathOfTheElement){
        driver.findElement(By.xpath(xpathOfTheElement)).click();
    }

    public void fillingForm(){
        driver.findElement(By.name("email")).sendKeys("testing@test.com");
        driver.findElement(By.name("confirm")).sendKeys("testing@test.com");
        driver.findElement(By.name("password")).sendKeys("holamundo");
        driver.findElement(By.name("displayname")).sendKeys("testing123");
    }

    public void fillingForm(String anEmail, String confirmationEmail, String aPassword, String alias){
        driver.findElement(By.name("email")).sendKeys(anEmail);
        driver.findElement(By.name("confirm")).sendKeys(confirmationEmail);
        driver.findElement(By.name("password")).sendKeys(aPassword);
        driver.findElement(By.name("displayname")).sendKeys(alias);
    }

}
