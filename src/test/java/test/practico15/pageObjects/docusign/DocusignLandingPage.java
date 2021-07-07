package test.practico15.pageObjects.docusign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.practico15.pageObjects.BasePage;

public class DocusignLandingPage extends BasePage {

    //private WebDriver driver;
    public DocusignLandingPage(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public String pageTitle(){
        return driver.getTitle();
    }

    public DocusignRegistrationPage clickOnTryForFreeButton(){
        driver.findElement(By.xpath("//*[@href='https://go.docusign.com/o/trial']")).click();
        return new DocusignRegistrationPage(driver); // retornando la pagina siguiente despues del click.
    }
}
