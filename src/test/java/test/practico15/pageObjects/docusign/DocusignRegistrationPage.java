package test.practico15.pageObjects.docusign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.practico15.pageObjects.BasePage;

public class DocusignRegistrationPage extends BasePage {

    //private WebDriver driver;
    public DocusignRegistrationPage(WebDriver remoteDriver){
        driver = remoteDriver;
    }
    public void fillingRegistrationFields(){
        driver.findElement(By.name("first_name")).sendKeys("Alan");
        driver.findElement(By.name("last_name")).sendKeys("Pow");
        driver.findElement(By.name("email")).sendKeys("testing@test.com");
        driver.findElement(By.name("phone")).sendKeys("12345");

    }

    public void clickOnGetStartedButton(){
        driver.findElement(By.id("submitMainText_0")).click();
    }

    public WebElement getTitleError(){
        return driver.findElement(By.xpath("//*[contains(text(), 'Job title required')]"));
    }

    public WebElement getIndustryError(){
        return driver.findElement(By.xpath("//*[contains(text(), 'Select an industry')]"));
    }
}
