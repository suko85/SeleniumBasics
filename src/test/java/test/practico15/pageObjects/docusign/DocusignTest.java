package test.practico15.pageObjects.docusign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.practico15.Utils.Constants;
import test.practico15.test.BaseTest;

import java.util.concurrent.TimeUnit;

public class DocusignTest extends BaseTest {
    WebDriver driver;
    private DocusignLandingPage docusignLandingPage;
    private Constants constants;

    @Test
    public void getTitleTest(){
       String actualTitle = docusignLandingPage.pageTitle();
       Assert.assertEquals(driver.getTitle(), "DocuSign | #1 in Electronic Signature and Agreement Cloud");
    }

    //public String JOB_TITLE_REQUIRED_MESSAGE;

    @Test
    public void docusignRegistrationTest() throws InterruptedException {
        //driver.findElement(By.xpath("//*[@href='https://go.docusign.com/o/trial']")).click();

        DocusignRegistrationPage docusignRegistrationPage = docusignLandingPage.clickOnTryForFreeButton();
        docusignRegistrationPage.fillingRegistrationFields();
        docusignRegistrationPage.clickOnGetStartedButton();

        WebElement emptyTitleError = docusignRegistrationPage.getTitleError();
        WebElement emptyIndustryError = docusignRegistrationPage.getIndustryError();

        Assert.assertEquals(emptyTitleError.getText(), constants.JOB_TITLE_REQUIRED_MESSAGE);
        Assert.assertEquals(emptyIndustryError.getText(), constants.JOB_INDUSTRY_REQUIRED_MESSAGE);
    }

}
