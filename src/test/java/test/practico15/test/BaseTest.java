package test.practico15.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.practico15.Utils.Constants;
import test.practico15.pageObjects.docusign.DocusignLandingPage;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;


    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(600, 400));
        driver.get("http://www.docusign.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DocusignLandingPage docusignLandingPage = new DocusignLandingPage(driver);
    }

    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(15000);
        driver.close();
    }
}
